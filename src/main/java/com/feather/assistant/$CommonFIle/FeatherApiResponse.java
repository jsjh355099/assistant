package com.feather.assistant.$CommonFIle;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {@ApiResponse(code = 200, message = "請求成功"),
        @ApiResponse(code = 400, message = "錯誤請求(Bad Request)"),
        @ApiResponse(code = 401, message = "用戶停權(Unauthorized)"),
        @ApiResponse(code = 403, message = "拒絕授權(Forbidden)"),
        @ApiResponse(code = 404, message = "找不到路徑(Not Found)"),
        @ApiResponse(code = 405, message = "方法不被允許(Method not allowed)"),
        @ApiResponse(code = 500, message = "伺服器錯誤(Internal Server Error)"),
        @ApiResponse(code = 503, message = "伺服器無法使用(Service Unavailable)")})
public @interface FeatherApiResponse {
    ResponseHeader[] responseHeaders() default @ResponseHeader(name = "", response = Void.class);
}
