package com.tianji.common.exceptions;

import lombok.Getter;

/**
 * 统一异常的父类
 */
@Getter
public class CommonException extends RuntimeException{
    private final int code;

    public CommonException(String message) {
        super(message);
        this.code = 0;
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
        this.code = 0;
    }

    public CommonException(int code, String message) {
        super(message);
        this.code = code;
    }

    public CommonException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public int getStatus(){
        return 500;
    };
}
