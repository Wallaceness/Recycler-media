package com.example.android.recycledemo;

public class Message {
    public String name;
    public String comment;
    public String src;
    public boolean drawable=false;

    public Message(String name, String comment, String src, boolean drawable){
        this.name=name;
        this.comment=comment;
        this.src=src;
        this.drawable=drawable;
    }
}
