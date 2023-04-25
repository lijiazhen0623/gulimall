package com.zhen.gulimall.product.exception;


import com.zhen.common.exception.BizCodeEnum;
import com.zhen.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Objects;

/**
 * 集中处理控制器的所有异常
 * @author LiJiaZhen
 * @date 2023/4/16 23:01
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.zhen.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {
    /**
     * 数据校验异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public R vaildExceptionHandle(MethodArgumentNotValidException e){
        log.error("数据校验出现问题{}，异常类型：{}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        HashMap<String, String> error = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError) ->
                error.put(fieldError.getField(),fieldError.getDefaultMessage()));
        return R.error(BizCodeEnum.VAILD_EXCEPTION.getCode(), BizCodeEnum.VAILD_EXCEPTION.getMsg())
                .put("data",error);
    }

    /**
     * 总异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = {Throwable.class})
    public R exceptionHandle(Throwable e){
        log.error("错误：",e);
        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMsg());
    }
}
