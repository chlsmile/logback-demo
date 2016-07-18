package com.chlsmile.logback.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with: IntelliJ IDEA.
 * Function:
 * User: chlsmile
 * Date: 2016-07-18 17:22:00
 */
public class LogbackDemo {

    private static Logger logger=LoggerFactory.getLogger(LogbackDemo.class);

    public static void main(String[] args) {
        logger.trace("======trace");
        logger.debug("======debug");
        logger.info("======info");
        logger.warn("======warn");
        logger.error("======error");
    }
}
