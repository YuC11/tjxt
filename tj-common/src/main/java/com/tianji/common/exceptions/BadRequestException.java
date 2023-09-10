package com.tianji.common.exceptions;

import lombok.Getter;

/**
 * 请求参数异常，状态码400
 */
@Getter
public class BadRequestException extends CommonException{
    private final int status = 400;

    public BadRequestException(String message) {
        super(400, message);
    }

    public BadRequestException(int code, String message) {
        super(code, message);
    }

    public BadRequestException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
