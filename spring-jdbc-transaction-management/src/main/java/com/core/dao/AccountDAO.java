package com.core.dao;

import java.math.BigDecimal;

/**
 * @author ManhKM on 7/4/2022
 * @project spring-jdbc-transaction-management
 * ----
 * Định nghĩa lớp Account Baking có 2 API lấy số tiền hiện tại và cập nhật số tiền trong tài khoản
 */
public interface AccountDAO {

    BigDecimal getCurrentAmount(int id);

    void updateAmount(int id, BigDecimal amount);

}
