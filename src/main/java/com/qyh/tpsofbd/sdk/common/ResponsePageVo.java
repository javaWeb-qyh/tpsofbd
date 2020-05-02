package com.qyh.tpsofbd.sdk.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 响应的列表集
 *
 * @author xg.zhao   2018 03 27 14:21
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePageVo<R> implements Serializable {

    /**
     * 数据结果的总条数
     */
    private long totalSize;

    /**
     * 查询后的结果集
     */
    private List<R> result;

    public static <R> ResponsePageVo<R> response(long totalSize, List<R> list) {
        return new ResponsePageVo<R>(totalSize, list);
    }

}
