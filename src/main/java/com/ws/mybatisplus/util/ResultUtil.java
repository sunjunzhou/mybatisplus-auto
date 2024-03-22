package com.ws.mybatisplus.util;


/**
 * @author KevinChen
 * @since 2018/4/25
 */
public class ResultUtil {

    public static Result success(Object data) {
        return new Result()
                .setData(data)
				.setCode(ResultCode.SUCCESS.code())
				.setMessage(ResultCode.SUCCESS.message());
    }

    public static Result error(ResultCode resultCode) {
        return error(resultCode.getCode(), resultCode.getMessage());
    }

    public static Result error(int code, String message) {
        return new Result()
                .setCode(code)
                .setMessage(message);
    }
}
