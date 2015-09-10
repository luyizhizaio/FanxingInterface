package com.uuzz.los.entity;

/**
 * Created by meixiaofeng on 2014/11/19.
 */
//import com.jd.org.msgpack.annotation.Message;

import java.io.Serializable;

//@Message
public class ReturnResponse<T> implements Serializable {
    private T data;
    private boolean success = true;
    private String errorInfos;
    private String errorCode;

    public ReturnResponse() {
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorInfos() {
        return null == this.errorInfos?null:this.errorInfos;
    }

    public void setErrorInfos(String errorInfos) {
        this.errorInfos = errorInfos;
    }

    /*public String getErrorInfos() {
        return null == this.errorInfos?null:this.errorInfos.toString();
    }

    public void setErrorInfos(String errorInfos) {
        this.errorInfos = new StringBuffer(errorInfos);
    }

    public void appendErrorInfos(String errorInfo) {
        if(null == this.errorInfos) {
            this.errorInfos = new StringBuffer();
        }

        this.errorInfos.append(errorInfo);
    }*/

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorCodeAndErrorInfos(String errorCode, String errorInfo) {
        this.success = false;
        this.errorCode = errorCode;
        this.setErrorInfos(errorInfo);
    }

    public String toString() {
        return "PublicResponse{data=" + this.data + ", success=" + this.success + ", errorInfos=" + this.errorInfos + ", errorCode=\'" + this.errorCode + '\'' + '}';
    }
}
