package com.qyh.tpsofbd.sdk.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 删除Id的列表
 *
 * @author cf.ye
 * @version 0.1  2018-05-23 15:02
 **/
@Data
public class DeleteIdListVo implements Serializable {

    private List<Long> delIdList;
}
