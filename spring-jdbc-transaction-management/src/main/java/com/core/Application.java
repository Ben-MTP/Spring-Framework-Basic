package com.core;

import com.core.service.AccountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @author ManhKM on 7/4/2022
 * @project spring-jdbc-transaction-management
 */
public class Application {
//    public static Logger logger = LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        AccountService accountService = (AccountService) ctx.getBean("accountServiceImpl");     //auto convert ClassName: AccountServiceImpl -> BeanName: accountServiceImpl
        /**
         * Thực hiện chuyển 10$ từ account có id = 1, sang account có id = 2
         */
        try {
            int sourceId = 1;
            int destId   = 2;
            int amount   = 10;
            accountService.transfer(sourceId, destId, BigDecimal.valueOf(amount));
//            logger.info("Transfer amount: {} - from: {} - to: {}", sourceId, destId, amount);
        } catch (Exception e) {
//            logger.error("Transfer missing!!! Please check again!!!");
        }
    }
}
