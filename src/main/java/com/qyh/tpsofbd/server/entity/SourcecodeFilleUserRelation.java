package com.qyh.tpsofbd.server.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: sourcecode_fille_user_relation
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SourcecodeFilleUserRelation implements Serializable {
    /**
     * Table:     sourcecode_fille_user_relation
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * Table:     sourcecode_fille_user_relation
     * Column:    user_id
     * Nullable:  false
     */
    private Long userId;

    /**
     * Table:     sourcecode_fille_user_relation
     * Column:    sourcecode_fille_id
     * Nullable:  false
     */
    private Long sourcecodeFilleId;

    /**
     * Table:     sourcecode_fille_user_relation
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * Table:     sourcecode_fille_user_relation
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}