package com.breadcrumbdata.anchor_service.controller;

import com.breadcrumbdata.anchor_service.exception.ExistIdException;
import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ExistIdException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public Map<String,Object> handleExistIdException(ExistIdException ex){
        Map<String, Object> result = new HashMap<>();
        result.put("id", ex.getId());
        result.put("message",ex.getMessage());
        return result;
    }

    @ExceptionHandler(FeignException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public Map<String,Object> handleFeignException(FeignException ex) {
        Map<String, Object> result = new HashMap<>();
        result.put("message",ex.contentUTF8());
        return result;
    }
}
