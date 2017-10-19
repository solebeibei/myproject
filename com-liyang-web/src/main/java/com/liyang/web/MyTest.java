package com.liyang.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by liyang21 on 2017/9/24.
 */
public class MyTest {
    private final static Logger logger = LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
        logger.info("logback 成功了");
        logger.error("logback 成功了");
        logger.debug("logback 成功了");
    }
}
