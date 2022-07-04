package com.core.dao.impl;

import com.core.dao.AccountDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ManhKM on 7/4/2022
 * @project spring-jdbc-transaction-management
 */

@Repository
public class AccountDAOImpl implements AccountDAO {

//    Logger logger = LogManager.getLogger(AccountDAOImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public BigDecimal getCurrentAmount(int id) {
        String sql = "SELECT amount FROM account WHERE id = " + id;
//        logger.info("SQL getCurrentAmount: {}", sql);
        return jdbcTemplate.query(sql, new ResultSetExtractor<BigDecimal>() {
            @Override
            public BigDecimal extractData(ResultSet rs) throws SQLException, DataAccessException {
                if(rs.next()){
                    return BigDecimal.valueOf(rs.getInt("amount"));
                }
                return BigDecimal.ZERO;
            }
        });
    }

    @Override
    public void updateAmount(int id, BigDecimal amount) {
        String sql = String.format("UPDATE account SET amount=%f WHERE id=%d", amount, id);
//        logger.info("SQL updateAmount: {}", sql);
        jdbcTemplate.execute(sql);
    }
}
