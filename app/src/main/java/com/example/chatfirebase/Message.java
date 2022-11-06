package com.example.chatfirebase;

import java.util.Date;
import com.google.firebase.firestore.ServerTimestamp;


public class Message {

    public Message(){}

    public String getUid() {
        return uid;
    }

    public void setUid(String userID) {
        this.uid = userID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    private String uid;
    private String userName;
    private String photoUrl;
    private String text;
    private @ServerTimestamp Date timestamp;
}
