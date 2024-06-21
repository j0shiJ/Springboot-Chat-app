package com.DevJ.JavaChatApp.chatroom;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class ChatRoom {
    private String ig;

        private String chatId;
        private String senderId;
    private String recipientId;

}
