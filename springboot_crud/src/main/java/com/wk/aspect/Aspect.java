package com.wk.aspect;

import com.wk.annotation.AspectAnnotation;
import com.wk.entity.LogPojo;
import com.wk.service.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.LogManager;

/**
 * @author Wangkun
 * @date 2020/7/18
 * @description
 **/
@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    @Autowired
    private LogService logService;

    private final Logger logger = LoggerFactory.getLogger(Aspect.class);
    /**
     * 定义切入点
     */
    @Pointcut("@annotation(com.wk.annotation.AspectAnnotation)")
    public void aa(){}

    /**
     * 织入通知
     */
    @AfterReturning("aa()&&@annotation(annotation)")
    public void logBefore(JoinPoint joinPoint,AspectAnnotation annotation){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.info("操作人IP地址："+request.getRemoteAddr()
        +"，操作请求的URL："+request.getRequestURL().toString()
        +"，类名和方法名："+joinPoint.getSignature().getDeclaringTypeName()+ "." +joinPoint.getSignature().getName()
        +"，参数："+signature.getParameterNames().toString()
        +"，操作："+annotation.operationDescription()
        +"，操作时间："+new Date());

        LogPojo logPojo = new LogPojo();
        logPojo.setIp(request.getRemoteAddr());
        logPojo.setUrl(request.getRequestURL().toString());
        logPojo.setDesc(annotation.operationDescription());
        logPojo.setClassFunction(joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        if (signature.getParameterNames().length>0){
            String[] parameterNames = signature.getParameterNames();
            logPojo.setAccordParameters(Arrays.toString(parameterNames));
        }else {
            logPojo.setAccordParameters("无");
        }
      /*  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = df.format(new Date());*/
        logPojo.setTime(new Date());
        logPojo.setLremark(annotation.remark());
        int row = logService.insert(logPojo);
    }
}
