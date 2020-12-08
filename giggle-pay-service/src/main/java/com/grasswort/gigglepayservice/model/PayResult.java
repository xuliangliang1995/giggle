package com.grasswort.gigglepayservice.model;

import java.io.Serializable;

/**
 * pay_result
 * @author 
 */
public class PayResult implements Serializable {
    private Integer id;

    private String result;

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

    private static final long serialVersionUID = 1L;
}