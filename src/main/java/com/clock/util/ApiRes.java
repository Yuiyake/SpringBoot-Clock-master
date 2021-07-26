package com.clock.util;

import lombok.Data;

/**
 * 返回类型封装
 */
@Data
public class ApiRes {

    public int code;
    public Object data;
    public String message;

    public ApiRes(){}

    public ApiRes (int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static ApiRes fail(String message) {
        ApiRes res = new ApiRes();
        res.setCode(500);
        res.setMessage(message);
        return res;
    }

    public static ApiRes ok(Object data) {
        ApiRes res = new ApiRes();
        res.setCode(200);
        res.setData(data);
        res.setMessage("success");
        return res;
    }
}
