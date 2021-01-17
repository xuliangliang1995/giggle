package com.grasswort.grasswortshardjdbc.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

/**
 * library
 * @author 
 */
public class Library implements Serializable {
    private Long id;

    private String name;

    private Instant gmtCreate;

    private Instant gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Instant gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Instant getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Instant gmtModified) {
        this.gmtModified = gmtModified;
    }
}