package com.example.lenovo.stackview;

public class StackItem {

    private int imageResourseId;
    private String text;

    public StackItem(int imageResourseId, String text) {
        this.imageResourseId = imageResourseId;
        this.text = text;
    }

    public int getImageResourseId() {
        return imageResourseId;
    }

    public void setImageResourseId(int imageResourseId) {
        this.imageResourseId = imageResourseId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
