package com.core.service.impl;

import com.core.dao.AccountDAO;
import com.core.service.AccountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author ManhKM on 7/4/2022
 * @project spring-jdbc-transaction-management
 */
@Service
public class AccountServiceImpl implements AccountService {

//    Logger logger = LogManager.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountDAO accountDAO;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void transfer(int sourceId, int destId, BigDecimal amount) throws Exception{
        BigDecimal sourceAmount = accountDAO.getCurrentAmount(sourceId);
        BigDecimal destAmount   = accountDAO.getCurrentAmount(destId);

        accountDAO.updateAmount(sourceId, sourceAmount.subtract(amount));
        accountDAO.updateAmount(destId, destAmount.add(amount));

//        logger.info("Transfer success - amount: {} - from: {} - to: {}", amount, sourceId, destId);
    }
}
