package com.example.retrofitappproject;

public class Posts {
    int userId,id;
    String tittle,body,mImage;

    public Posts(int userId, int id, String tittle, String body, String mImage) {
        this.userId = userId;
        this.id = id;
        this.tittle = tittle;
        this.body = body;
        this.mImage = mImage;
    }

    public Posts() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }
}
