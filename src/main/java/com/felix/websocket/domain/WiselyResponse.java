package com.felix.websocket.domain;

/**
 * 描述：
 *
 * @param
 * @Author fangyong
 * @Date 2018/9/21 15:34
 * @return
 **/
public class WiselyResponse {

    private String responseMessage;

    public WiselyResponse(String message) {
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
