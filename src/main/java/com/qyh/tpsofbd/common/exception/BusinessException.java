package com.qyh.tpsofbd.common.exception;


import com.qyh.tpsofbd.sdk.common.PlatformResult;

/**
 * 业务异常处理
 *
 * @author yt.wei
 * @date 2018 04 09 15:18
 */
public class BusinessException extends RuntimeException {

    /**
     * 默认异常码
     */
    private final static String DEFAULT_ERROR_CODE = "100000001";

    /**
     * 默认错误
     */
    private final static String DEFAULT_ERROR_MSG = "系统错误";

    /**
     * 默认错误等级
     */
    public final static String ERROR_LEVEL ="error";
    /**
     * info级别异常
     */
    public final static String INFO_LEVEL ="info";
    /**
     * warning级别异常
     */
    public final static String WARNING_LEVEL ="warning";


    /**
     * 异常码
     */
    private String errorCode;

    /**
     * 异常信息
     */
    private String errorMsg;

    /**
     * 异常等级
     */
    private  String errorLevel;

    /**
     *     无参构造函数
     */
    public BusinessException() {
        super(DEFAULT_ERROR_MSG);
        this.errorCode = DEFAULT_ERROR_CODE;
        this.errorMsg = DEFAULT_ERROR_MSG;
        this.errorLevel = ERROR_LEVEL;
    }

    public BusinessException(Throwable cause) {
        super(cause);
        this.errorCode = DEFAULT_ERROR_CODE;
        this.errorMsg = DEFAULT_ERROR_MSG;
        this.errorLevel = ERROR_LEVEL;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = DEFAULT_ERROR_CODE;
        this.errorMsg = message;
        this.errorLevel = ERROR_LEVEL;
    }

    public BusinessException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.errorMsg = message;
        this.errorLevel = ERROR_LEVEL;
    }

    public BusinessException(String errorCode, String message, String errorLevel) {
        super(message);
        this.errorCode = errorCode;
        this.errorMsg = message;
        this.errorLevel = errorLevel;
    }

    public BusinessException(ErrorCodeEnum errorCodeEnum, Throwable cause) {
        super(cause);
        this.errorCode = errorCodeEnum.getCode();
        this.errorMsg = errorCodeEnum.getMessage();
        this.errorLevel = ERROR_LEVEL;
    }

    /**
     * 异常数据提示带有变量的异常
     * @param errorCode 异常码
     * @param msgFormat 异常信息
     * @param args  异常等级
     */
    public BusinessException(String errorCode, String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
        this.errorCode = errorCode;
        this.errorMsg = String.format(msgFormat, args);
        this.errorLevel = ERROR_LEVEL;
    }

    /**
     * 异常数据提示带有变量的异常
     * @param errorCodeEnum 错误码
     * @param args  参数数组
     */
    public BusinessException(ErrorCodeEnum errorCodeEnum, Object... args) {
        super(String.format(errorCodeEnum.getMessage(), args));
        this.errorCode = errorCodeEnum.getCode();
        this.errorMsg = String.format(errorCodeEnum.getMessage(), args);
        this.errorLevel = ERROR_LEVEL;
    }

    /**
     * 异常数据提示带有变量的异常
     * @param errorCodeEnum 错误码
     * @param errorLevel  错误等级
     * @param args  参数数组
     */
    public BusinessException(ErrorCodeEnum errorCodeEnum, String errorLevel, Object... args) {
        super(String.format(errorCodeEnum.getMessage(), args));
        this.errorCode = errorCodeEnum.getCode();
        this.errorMsg = String.format(errorCodeEnum.getMessage(), args);
        this.errorLevel = errorLevel;
    }

    public BusinessException(String message, PlatformResult platformResult) {
        super(message);
        this.errorCode = platformResult.getMessage().getErrorCode();
        this.errorMsg = platformResult.getMessage().getErrorMsg();
        this.errorLevel = ERROR_LEVEL;
    }

    public BusinessException(String message, ErrorCodeEnum errorCodeEnum) {
        super(message);
        this.errorCode = errorCodeEnum.getCode();
        this.errorMsg = errorCodeEnum.getMessage();
        this.errorLevel = ERROR_LEVEL;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorLevel(){
        return  errorLevel;
    }

    public void setErrorLevel(String errorLevel) {
        this.errorLevel = errorLevel;
    }
}
