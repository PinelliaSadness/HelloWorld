package com.liuyumao.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

@Retention(RetentionPolicy.RUNTIME) // 设定注解的生命周期
@Target(ElementType.METHOD) // 设定注解的使用范围
@Documented // 给javadoc 做标识是否保留注解信息
//@Inherited // 被@Inherited注解修饰的注解具有继承性
public @interface EnableRedisLock {
    String lockKey();
    long expireTime() default 5;
    TimeUnit timeUnit() default TimeUnit.MINUTES;
    int retryTimes() default 10;
}
