package com.qyh.tpsofbd.sdk.vo;

import lombok.Data;

import java.sql.Timestamp;

/**
 * 用户信息对象Vo
 *
 * @author cf.ye
 * @version 0.1
 * @date 2019-04-01 13:27
 **/
@Data
public class UserVo {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户的姓名
     */
    private String userName;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Timestamp gmtCreate;

    /**
     * 更新时间
     */
    private Timestamp gmtModified;
}
