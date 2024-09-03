package com.chatproject.chatserver.controller.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Message {


    private  String senderName;
    private  String receiveName;
    private  String message;
    private  String date;
    private Status status;
}
