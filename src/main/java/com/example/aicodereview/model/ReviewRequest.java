package com.example.aicodereview.model;

public class ReviewRequest {

    private String code;

    public ReviewRequest() {
    }

    public ReviewRequest(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}