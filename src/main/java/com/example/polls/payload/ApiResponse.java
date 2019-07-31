package com.example.polls.payload;

import org.springframework.lang.Nullable;

/**
 * Created by rajeevkumarsingh on 19/08/17.
 */
public class ApiResponse {
    private Boolean success;
    private String message;

    @Nullable
    private Object body;

    public ApiResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ApiResponse(Boolean success, String message, Object body) {
        this.success = success;
        this.message = message;
        this.body = body;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Nullable
    public Object getBody() {
        return body;
    }

    public void setBody(@Nullable Object body) {
        this.body = body;
    }
}
