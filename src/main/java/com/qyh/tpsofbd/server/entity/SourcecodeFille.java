package com.qyh.tpsofbd.server.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Table: sourcecode_fille
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SourcecodeFille implements Serializable {
    /**
     * Table:     sourcecode_fille
     * Column:    id
     * Nullable:  false
     */
    private Long id;

    /**
     * Table:     sourcecode_fille
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * Table:     sourcecode_fille
     * Column:    sourcecode_fill_url
     * Nullable:  true
     */
    private String sourcecodeFillUrl;

    /**
     * Table:     sourcecode_fille
     * Column:    download_count
     * Nullable:  true
     */
    private Long downloadCount;

    /**
     * Table:     sourcecode_fille
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;

    /**
     * Table:     sourcecode_fille
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}