package com.qyh.tpsofbd.server.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: category
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {
    /**
     * Table:     category
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * 资源类目1名称
     *
     * Table:     category
     * Column:    level1_name
     * Nullable:  true
     */
    private String level1Name;

    /**
     * 资源类目2名称
     *
     * Table:     category
     * Column:    level2_name
     * Nullable:  true
     */
    private String level2Name;

    /**
     * Table:     category
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * Table:     category
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}