package com.tm.sbia.feature.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

/**
 * 消息处理器
 */
public class MarcoHandler extends AbstractWebSocketHandler {
    private Logger LOGGER = LoggerFactory.getLogger(MarcoHandler.class);

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        LOGGER.info("Received message: " + message.getPayload());

        Thread.sleep(2000);

        session.sendMessage(new TextMessage("polo!"));
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        LOGGER.info("Connection established!");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        LOGGER.info("Connection closed!");
    }
}
