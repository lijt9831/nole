package com.jxyd.nole.web.ms.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = NoHandlerFoundException.class)  
    public String handleNoHandlerFoundException()  {  
        return "404";  
    }

}
