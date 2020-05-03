package com.qyh.tpsofbd.sdk.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 服务统一的返回结果
 *
 * @author yt.wei
 * @version 0.1
 * @date 2018/3/29 10:07
 */
@Data
@ToString
public class PlatformResult<R> implements Serializable {

    /**
     * 返回成功
     */
    public static final byte TRUE = 0;

    /**
     * 返回失败
     */
    public static final byte FALSE = 1;

    /**
     * 响应状态值：0成功，1失败
     */
    private byte status;

    /**
     * 响应失败信息
     */
    private Message message;

    /**
     * 响应结果集
     */
    private R data;

/**
 * @Description: 
 * 无参构造方法默认响应成功,没有数据集
 * @Author: qyh
 * @Date: 2020/5/3 14:36
 */
    public PlatformResult() {
        this.status = TRUE;
    }

//    public PlatformResult(String errorCode, String errorMsg) {
//        this.status = FALSE;
//        this.message = new Message(errorCode, errorMsg);
//    }

    /**
     * @Description: 
     * 响应失败时构造方法
     * @Author: qyh
     * @Date: 2020/5/3 14:38
     */
    public PlatformResult(String errorCode, String errorMsg, String errorLevel) {
        this.status = FALSE;
        this.message = new Message(errorCode, errorMsg, errorLevel);
    }

//    public PlatformResult(byte status, String errorCode, String errorMsg) {
//        this.status = status;
//        this.message = new Message(errorCode, errorMsg);
//    }

    /**
     * @Description: 
     * 响应成功,由结果集时构造方法
     * @Author: qyh
     * @Date: 2020/5/3 14:39
     */
    public PlatformResult(R data) {
        this.status = TRUE;
        this.data = data;
    }

//    public PlatformResult(byte status, Message message, R data) {
//        this.status = status;
//        this.message = message;
//        this.data = data;
//    }

//    public PlatformResult(byte status) {
//        this.status = status;
//    }

    public static <R> PlatformResult<R> success(R data) {
        return new PlatformResult<R>(data);
    }

    public static <R> PlatformResult<R> success() {
        return new PlatformResult<>();
    }
    
    public static <R> PlatformResult<ResponsePageVo<R>> success(List<R> result, long totalSize) {
        return success(new ResponsePageVo<R>(totalSize, result));
    }

//    public static <R> PlatformResult<R> failure() {
//        return new PlatformResult<R>((byte) 0);
//    }


    public static <R> PlatformResult<R> failure(String errorCode, String errorMsg,
                                                String errorLevel) {
        return new PlatformResult<R>(errorCode, errorMsg, errorLevel);
    }


    public static <R> PlatformResult<R> failureInfo(String errorCode, String errorMsg) {
        return new PlatformResult<R>(errorCode, errorMsg, Message.INFO);
    }

    public static <R> PlatformResult<R> failureWarning(String errorCode, String errorMsg) {
        return new PlatformResult<R>(errorCode, errorMsg, Message.WARNING);
    }

    public static <R> PlatformResult<R> failureError(String errorCode, String errorMsg) {
        return new PlatformResult<R>(errorCode, errorMsg, Message.ERROR);
    }

//    public static <R> PlatformResult<R> failure(R data, Message message) {
//        return new PlatformResult<R>((byte) 0, message, data);
//    }

    @Getter
    @Setter
    @ToString
    public static class Message {

        public static final String INFO = "info";
        public static final String WARNING = "warning";
        public static final String ERROR = "error";

        private String errorCode;

        private String errorMsg;

        private String errorLevel;

        public Message() {
            this.errorCode = "";
            this.errorMsg = "";
            this.errorLevel = ERROR;
        }

        public Message(String errorCode, String errorMsg) {
            this.errorCode = errorCode;
            this.errorMsg = errorMsg;
            this.errorLevel = ERROR;
        }

        public Message(String errorCode, String errorMsg, String errorLevel) {
            this.errorCode = errorCode;
            this.errorMsg = errorMsg;
            this.errorLevel = errorLevel;
        }
    }
}
