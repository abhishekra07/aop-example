package com.codelabs.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class LoggingUtil {

    private static Logger logger = LoggerFactory.getLogger(LoggingUtil.class);

    public LoggingUtil() {}

    private static void logEntryInfo(ProceedingJoinPoint joinPoint) {
        logger.info("Entering: {} args :: {}",joinPoint.getSignature().toShortString(), Arrays.toString(joinPoint.getArgs()));
    }

    private static void logExitInfo(ProceedingJoinPoint joinPoint, Object result) {
        logger.info("Exiting: {} result :: {}",joinPoint.getSignature().toShortString(), result);
    }

    public static Object logMethodEntryAndExitInfo(ProceedingJoinPoint joinPoint) throws Throwable {
        logEntryInfo(joinPoint);
        Object result = joinPoint.proceed();
        logExitInfo(joinPoint, result);
        return result;
    }
}
