package com.grasswort.giggleorderservice.model;

import java.io.Serializable;

/**
 * order_result
 * @author 
 */
public class OrderResult implements Serializable {
    private Integer id;

    private String result;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}