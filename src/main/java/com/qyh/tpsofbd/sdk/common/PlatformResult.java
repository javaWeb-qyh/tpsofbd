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
    public static final byte TRUE = 1;

    /**
     * 返回失败
     */
    public static final byte FALSE = 0;

    /**
     * 响应状态值
     */
    private byte success;

    /**
     * 响应失败信息
     */
    private Message message;

    /**
     * 响应结果集
     */
    private R data;

    public PlatformResult() {
        this.success = TRUE;
    }

    public PlatformResult(String errorCode, String errorMsg) {
        this.success = FALSE;
        this.message = new Message(errorCode, errorMsg);
    }

    public PlatformResult(String errorCode, String errorMsg, String errorLevel) {
        this.success = FALSE;
        this.message = new Message(errorCode, errorMsg, errorLevel);
    }

    public PlatformResult(byte success, String errorCode, String errorMsg) {
        this.success = success;
        this.message = new Message(errorCode, errorMsg);
    }

    public PlatformResult(R data) {
        this.success = TRUE;
        this.data = data;
    }

    public PlatformResult(byte success, Message message, R data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public PlatformResult(byte success) {
        this.success = success;
    }

    public static <R> PlatformResult<R> success(R data) {
        return new PlatformResult<R>(data);
    }

    public static <R> PlatformResult<R> success() {
        return new PlatformResult<R>();
    }

    public static <R> PlatformResult<ResponsePageVo<R>> success(List<R> result, long totalSize) {
        return success(new ResponsePageVo<>(totalSize, result));
    }

    public static <R> PlatformResult<R> failure() {
        return new PlatformResult<R>((byte) 0);
    }

    public static <R> PlatformResult<R> failure(String errorCode, String errorMsg) {
        return new PlatformResult<R>(errorCode, errorMsg, Message.ERROR);
    }

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

    public static <R> PlatformResult<R> failure(R data, Message message) {
        return new PlatformResult<R>((byte) 0, message, data);
    }

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
