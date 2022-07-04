package com.core.service;

import java.math.BigDecimal;

/**
 * @author ManhKM on 7/4/2022
 * @project spring-jdbc-transaction-management
 */
public interface AccountService {
    /**
     * Mục đích dùng cho việc chuyển số tiền từ tài khoản này sang tài khoản khác
     * @param sourceId - Id của tài khoản nguồn
     * @param destId - Id của tài khoản đích
     * @param amount - Số tiền trong một giao dịch
     */
    void transfer(int sourceId, int destId, BigDecimal amount) throws Exception;
}
