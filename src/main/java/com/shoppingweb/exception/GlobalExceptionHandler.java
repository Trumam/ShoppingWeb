package com.shoppingweb.exception;

import com.shoppingweb.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
//HttpServletRequest request参数报错500，被删去

@ControllerAdvice(basePackages="com.shoppingweb.controller")
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    //统一异常处理ßExceptionHandler,主要用于Exception0

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        log.error("异常信息:", e);
        return Result.error("系统异常");
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public Result customError(CustomException e){
        log.error("CustomException occurred: {}", e.getMessage());
        return Result.error(e.getMsg());
    }
}











