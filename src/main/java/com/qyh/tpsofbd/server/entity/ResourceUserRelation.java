package com.qyh.tpsofbd.server.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: resource_user_relation
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceUserRelation implements Serializable {
    /**
     * Table:     resource_user_relation
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * Table:     resource_user_relation
     * Column:    user_id
     * Nullable:  false
     */
    private Long userId;

    /**
     * Table:     resource_user_relation
     * Column:    resource_id
     * Nullable:  false
     */
    private Long resourceId;

    /**
     * Table:     resource_user_relation
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * Table:     resource_user_relation
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}