package com.example.chatapp.model;

import lombok.Builder;
import lombok.Getter;

@Builder
// Builder is basically a design pattern to let use create object with optional
// parameters
// For VSCode, Lombok Annotations Support for VS Code is needed to remove lombok errors
public class ChatMessage {
    @Getter
    private MessageType type;

    @Getter
    private String content;
    
    @Getter
    private String sender;
    
    @Getter
    private String time;

    
}
