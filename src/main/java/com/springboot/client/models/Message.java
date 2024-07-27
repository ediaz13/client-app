package com.springboot.client.models;

public class Message {
    private String text;
    private String user;

    public Message() {
    }

    public Message(String text, String user) {
        this.text = text;
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public String getUser() {
        return user;
    }
}
