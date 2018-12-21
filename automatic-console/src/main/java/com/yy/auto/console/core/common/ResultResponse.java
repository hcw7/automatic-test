package com.yy.auto.console.core.common;


import java.io.Serializable;


public class ResultResponse implements Serializable {

    private static final long serialVersionUID = -4722736885321040003L;

    private String resultCode;

    private String resultMsg;

    private Object data;

    /**
     * Creates a new instance of BaseResponse.
     *
     * @param resultCode
     * @param resultMsg
     */
    public ResultResponse(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public ResultResponse(ResultCode code) {
        this.resultCode = code.getCode();
        this.resultMsg = code.getDescription();
    }

    public ResultResponse(ResultCode code, String resultMsg) {
        this.resultCode = code.getCode();
        this.resultMsg = resultMsg;
    }

    public ResultResponse() {}

    public void setResult(ResultCode code) {
        this.resultCode = code.getCode();
        this.resultMsg = code.getDescription();
    }

    public void setResult(ResultCode code, String resultMsg) {
        this.resultCode = code.getCode();
        this.resultMsg = resultMsg;
    }
    
    public void setResult(String code, String resultMsg) {
        this.resultCode = code;
        this.resultMsg = resultMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
