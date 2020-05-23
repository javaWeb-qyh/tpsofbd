package com.qyh.tpsofbd.sdk.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 
 * 服务统一的返回结果
 * 异常统一由异常结果类处理,这里只返回无异常时的结果
 * @Author: qyh
 * @Date: 2020/5/23 13:39
 */
@Data
@ToString
public class PlatformResult<R> implements Serializable {

    /**
     * 响应状态值：0成功，1失败
     */
    private final byte success =0;

    /**
     * 响应结果集
     */
    private R data;

    /**
     * @Description: 
     * 无结果集时构造方法
     * @Author: qyh
     * @Date: 2020/5/23 13:38
     */
    public PlatformResult() {}

    /**
     * @Description: 
     * 有结果集时构造方法
     * @Author: qyh
     * @Date: 2020/5/3 14:39
     */
    public PlatformResult(R data) {
        this.data = data;
    }


    /**
     * @Description: 
     * 有数据集返回时调用
     * @Author: qyh
     * @Date: 2020/5/23 13:37
     */
    public static <R> PlatformResult<R> success(R data) {
        return new PlatformResult<R>(data);
    }

    /**
     * @Description: 
     * 无数据集返回时调用
     * @Author: qyh
     * @Date: 2020/5/23 13:36
     */
    public static <R> PlatformResult<R> success() {
        return new PlatformResult<>();
    }

    /**
     * @Description: 
     * 返回分页查询数据时调用
     * @Author: qyh
     * @Date: 2020/5/23 13:33
     */
    public static <R> PlatformResult<ResponsePageVo<R>> success(List<R> result, long totalSize) {
        return success(new ResponsePageVo<R>(totalSize, result));
    }

}
