package com.qyh.tpsofbd.server.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: markdown_file
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarkdownFile implements Serializable {
    /**
     * Table:     markdown_file
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * Table:     markdown_file
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * Table:     markdown_file
     * Column:    markdown_file_url
     * Nullable:  true
     */
    private String markdownFileUrl;

    /**
     * Table:     markdown_file
     * Column:    click_count
     * Nullable:  true
     */
    private Long clickCount;

    /**
     * Table:     markdown_file
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * Table:     markdown_file
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}