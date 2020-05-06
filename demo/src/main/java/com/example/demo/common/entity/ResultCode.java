package com.example.demo.common.entity;

import lombok.Getter;

@Getter
public enum ResultCode {

    SUCCESS(10000, "操作成功"),

    FAILED(10001, "响应失败"),

    VALIDATE_FAILED(10002, "参数校验失败"),

    ERROR(50000, "未知错误");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
