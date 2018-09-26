package com.felix.websocket.web;

import com.felix.websocket.domain.WiselyMessage;
import com.felix.websocket.domain.WiselyResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * 描述：
 *
 * @param
 * @Author fangyong
 * @Date 2018/9/21 15:36
 * @return
 **/
@Controller
public class WsController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception{
        Thread.sleep(3000);
        return new WiselyResponse("welcome,"+ message.getName()+"!");
    }
}
