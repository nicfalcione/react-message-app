package com.nic.falcione.reactspringbootapp.controllers;

import com.nic.falcione.reactspringbootapp.objects.ConnectedUser;
import com.nic.falcione.reactspringbootapp.objects.ConnectedUserList;
import com.nic.falcione.reactspringbootapp.objects.Message;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * The {@link RestController} for messages between Connected Users
 * 
 * @author Nic Falcione
 */
@RestController
@CrossOrigin("http://localhost:3000")
public class MessageController {
    
    ConnectedUserList userList = new ConnectedUserList();

    @MessageMapping("/chat")
    @SendTo("/chat")
    public Message index(Message message) {
        return message;
    }

    @MessageMapping("/chat/connected_users")
    @SendTo("/chat/connected_users")
    public ConnectedUserList connectedUsers(ConnectedUser user) {
        userList.handleUser(user);
        return userList;
    }
}
