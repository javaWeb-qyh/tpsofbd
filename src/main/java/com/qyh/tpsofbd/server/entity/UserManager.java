package com.qyh.tpsofbd.server.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: user_manager
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserManager implements Serializable {
    /**
     * 主键
     *
     * Table:     user_manager
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * 用户名,必填,唯一
     *
     * Table:     user_manager
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * Table:     user_manager
     * Column:    password
     * Nullable:  true
     */
    private String password;

    /**
     * 邮箱为选填项
     *
     * Table:     user_manager
     * Column:    email
     * Nullable:  true
     */
    private String email;

    /**
     * 是否是管理员用户
     *
     * Table:     user_manager
     * Column:    is_admin
     * Nullable:  true
     */
    private Byte isAdmin;

    /**
     * Table:     user_manager
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * Table:     user_manager
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}