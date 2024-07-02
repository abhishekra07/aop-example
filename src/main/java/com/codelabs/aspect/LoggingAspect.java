package com.codelabs.aspect;

import com.codelabs.utils.LoggingUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("within(com.codelabs.controller..*)")
    public Object logMethodEntryAndExitController(ProceedingJoinPoint joinPoint) throws Throwable {
        return LoggingUtil.logMethodEntryAndExitInfo(joinPoint);
    }
}
