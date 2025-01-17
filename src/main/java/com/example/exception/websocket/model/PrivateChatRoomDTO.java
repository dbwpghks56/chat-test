package com.example.exception.websocket.model;

import lombok.Data;

import java.util.HashMap;
import java.util.UUID;

@Data
public class PrivateChatRoomDTO {
    private String roomId;
    private String roomName;
    private long userCount;

    private HashMap<String, String> userList = new HashMap<>();

    public PrivateChatRoomDTO create(String roomName) {
        PrivateChatRoomDTO chatRoom = new PrivateChatRoomDTO();
        this.roomId = UUID.randomUUID().toString();
        this.roomName = roomName;

        return chatRoom;
    }

}
