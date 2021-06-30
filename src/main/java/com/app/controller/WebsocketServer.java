package com.app.controller;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author:yyz
 * Email:2562874272@qq.com
 * Date:2021/2/22
 **/

@ServerEndpoint("/webSocket/{username}")
@Component
public class WebsocketServer {
    private static int onlineCount = 0;
    private static final Map<String, WebsocketServer> clients = new ConcurrentHashMap<>();
    private Session session;
    private String username;

    @OnOpen
    public void onOpen(@PathParam("username") String username, Session session) {
        this.username = username;
        this.session = session;
        com.app.controller.WebsocketServer.onlineCount++;
        System.out.println(this.username);
        System.out.println(this.session);
        System.out.println(com.app.controller.WebsocketServer.onlineCount);
        clients.put(username, this);
    }

    @OnClose
    public void onClose() {
        clients.remove(username);
        com.app.controller.WebsocketServer.onlineCount--;
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println(session.getId() + " say " + message);
        this.broadcast("[用户" + session.getId() + "]说：" + message);
    }

    @OnError
    public void onError(Throwable throwable) {
         System.out.println("WebSocket发生错误：" + throwable.getMessage());
    }

    private void broadcast(String message) {
        sendMessage(message,this.session);
//        sessions.forEach(session -> sendMessage(message, session));
    }

    public static void sendMessage(String message, Session session) {
//         向所有连接websocket的客户端发送消息
//         可以修改为对某个客户端发消息
        clients.values().forEach(o->System.out.println());
        for (WebsocketServer item : clients.values()) {
            item.session.getAsyncRemote().sendText(message);
        }
        try {
            session.getBasicRemote().sendText(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
