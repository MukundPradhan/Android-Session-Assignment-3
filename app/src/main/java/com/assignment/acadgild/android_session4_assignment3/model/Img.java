package com.assignment.acadgild.android_session4_assignment3.model;

/**
 * Created by mukund on 6/4/16.
 */
public class Img {
    private int ImgSrc;
    private String imgName;

    public Img(int imgSrc, String imgName) {
        ImgSrc = imgSrc;
        this.imgName = imgName;
    }

    public int getImgSrc() {
        return ImgSrc;
    }

    public void setImgSrc(int imgSrc) {
        ImgSrc = imgSrc;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
}
