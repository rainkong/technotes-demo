

package com.technotes.annotationdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogTimeAspect {

    /** 以增加CustomLog注解为切入点 */
    @Pointcut("@annotation(com.technotes.annotationdemo.annotation.CustomLog)")
    public void customLog() {}

    /**
     * 环绕
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("customLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();

        System.out.printf("%s %s Time %s ms\n", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(),
                (System.currentTimeMillis() - startTime));
        return result;
    }



}
