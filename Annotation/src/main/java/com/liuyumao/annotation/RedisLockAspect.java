package com.liuyumao.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.concurrent.TimeUnit;

@Aspect
public class RedisLockAspect {

    @Around(value = "@annotation(com.liuyumao.annotation.EnableRedisLock)")
    public void handleRedisLock(ProceedingJoinPoint joinPoint) {

        // 通过反射获取到注解对象
        EnableRedisLock enableRedisLock = ((MethodSignature) joinPoint.getSignature())
                .getMethod()
                .getAnnotation(EnableRedisLock.class);

        // 获取注解对象的变量值
        String lockKey = enableRedisLock.lockKey();
        long expireTime = enableRedisLock.expireTime();
        TimeUnit timeUnit = enableRedisLock.timeUnit();
        int retryTimes = enableRedisLock.retryTimes();

        // 获取锁
        if (tryLock(lockKey, expireTime, timeUnit, retryTimes)) {
            try {
                // 获取锁成功继续执行业务逻辑
                joinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            } finally {
                releseLock();
            }
        }
    }

    private void releseLock() {

    }

    private boolean tryLock(String lockKey, long expireTime, TimeUnit timeUnit, int retryTimes) {
        return true;
    }
}
