package com.wk.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author Wangkun
 * @date 2020/7/18
 * @description
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Order(Ordered.HIGHEST_PRECEDENCE)
@Documented
public @interface AspectAnnotation {
    String operationDescription() default "";
    String remark() default "";
}
