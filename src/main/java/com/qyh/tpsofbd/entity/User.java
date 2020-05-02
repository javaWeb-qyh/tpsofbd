package com.qyh.tpsofbd.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /**
     * 帐号的id
     *
     * Table:     user
     * Column:    user_id
     * Nullable:  false
     */
    private Long userId;

    /**
     * 用户的姓名
     *
     * Table:     user
     * Column:    user_name
     * Nullable:  false
     */
    private String userName;

    /**
     * 用户状态 0 正常 1停用
     *
     * Table:     user
     * Column:    status
     * Nullable:  false
     */
    private Byte status;

    /**
     * 用户的邮箱 邮箱的规则
     *
     * Table:     user
     * Column:    email
     * Nullable:  true
     */
    private String email;

    /**
     * 用户的手机 手机的规则
     *
     * Table:     user
     * Column:    phone
     * Nullable:  true
     */
    private String phone;

    /**
     * 描述信息
     *
     * Table:     user
     * Column:    description
     * Nullable:  true
     */
    private String description;

    /**
     * 所在部门名称
     *
     * Table:     user
     * Column:    department_name
     * Nullable:  true
     */
    private String departmentName;

    /**
     * 创建时间
     *
     * Table:     user
     * Column:    gmt_create
     * Nullable:  true
     */
    private Date gmtCreate;

    /**
     * 更新时间
     *
     * Table:     user
     * Column:    gmt_modified
     * Nullable:  true
     */
    private Date gmtModified;

    private static final long serialVersionUID = 1L;
}