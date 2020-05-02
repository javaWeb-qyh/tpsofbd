package com.qyh.tpsofbd.sdk.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author xg.zhao   2018 03 27 14:10
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RequestPageVo<D> implements Serializable{

    /**
     * 每一页的行数
     */
    private int pageSize;

    /**
     * 查询的页数
     */
    private int pageNo;

    /**
     * 查询列表条件集
     */
    private D data;

    public RequestPageVo(int pageSize, int pageNo) {
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }
}
