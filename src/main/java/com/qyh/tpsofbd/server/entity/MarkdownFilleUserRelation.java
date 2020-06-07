package com.qyh.tpsofbd.server.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: markdown_fille_user_relation
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarkdownFilleUserRelation implements Serializable {
    /**
     * Table:     markdown_fille_user_relation
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * Table:     markdown_fille_user_relation
     * Column:    user_id
     * Nullable:  false
     */
    private Long userId;

    /**
     * Table:     markdown_fille_user_relation
     * Column:    markdown_file_id
     * Nullable:  false
     */
    private Long markdownFileId;

    /**
     * Table:     markdown_fille_user_relation
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * Table:     markdown_fille_user_relation
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}