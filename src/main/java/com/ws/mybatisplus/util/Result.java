package com.ws.mybatisplus.util;

import com.ws.mybatisplus.constant.CommonConstants;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author KevinChen
 * @since 2018/4/23
 */
@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
	@Setter
    private int code = CommonConstants.SUCCESS;

    @Getter
	@Setter
    private String message = "success";

    @Getter
	@Setter
    private T data;

    public Result() {
        super();
    }

    public Result(T data) {
        super();
        this.data = data;
    }

    public Result(T data, String message) {
        super();
        this.data = data;
        this.message = message;
    }

    public Result(Throwable e) {
        super();
        this.message = e.getMessage();
        this.code = CommonConstants.FAIL;
    }
}
