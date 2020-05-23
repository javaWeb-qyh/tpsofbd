package com.qyh.tpsofbd.common.exception;

/**
 * @description:自定义业务异常累
 * @AUTHOR: qyh
 * @create: 2020-05-23 12:17
 **/
public class BusinessException extends RuntimeException {

    private ErrorCodeEnum errorCodeEnum;

    public BusinessException(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
    }

    public ErrorCodeEnum getErrorCodeEnum() {
        return errorCodeEnum;
    }

    public void setErrorCodeEnum(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
    }
}
