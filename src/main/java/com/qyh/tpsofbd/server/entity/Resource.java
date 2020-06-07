package com.qyh.tpsofbd.server.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: resource
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resource implements Serializable {
    /**
     * Table:     resource
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * 资源名称
     *
     * Table:     resource
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * 资源展示背景图url
     *
     * Table:     resource
     * Column:    image_url
     * Nullable:  true
     */
    private String imageUrl;

    /**
     * Table:     resource
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * Table:     resource
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    /**
     * Table:     resource
     * Column:    category_id
     * Nullable:  false
     */
    private Long categoryId;

    /**
     * Table:     resource
     * Column:    markdown_file_id
     * Nullable:  false
     */
    private Long markdownFileId;

    /**
     * Table:     resource
     * Column:    sourcecode_fille_id
     * Nullable:  false
     */
    private Long sourcecodeFilleId;

    /**
     * 收藏数
     *
     * Table:     resource
     * Column:    star_count
     * Nullable:  true
     */
    private Long starCount;

    private static final long serialVersionUID = 1L;
}