package com.example.demo.common.controller;

import com.example.demo.common.entity.APIException;
import com.example.demo.common.entity.ResultCode;
import com.example.demo.common.entity.ResultVO;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
      //  return objectError.getDefaultMessage();
        return new ResultVO<>(ResultCode.VALIDATE_FAILED, "参数校验失败", objectError.getDefaultMessage());
    }

    @ExceptionHandler(APIException.class)
    public ResultVO<String> APIExceptionHandler(APIException e) {
        return new ResultVO<>(ResultCode.FAILED, "响应失败", e.getMsg());
      //  return e.getMsg();
    }

}
