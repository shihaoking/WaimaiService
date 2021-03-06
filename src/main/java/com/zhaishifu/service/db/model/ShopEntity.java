package com.zhaishifu.service.db.model;

import java.io.Serializable;

/**
 * Created by shihaoking on 2015/11/30.
 */
public class ShopEntity implements Serializable {
    private int id= -1;
    private String name;
    private String address;
    private String phoneNumber;
    private String imageUrl;
    private int categoryId;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = "http://10.14.3.35:9000/Contents/ShopImages/" + imageUrl;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
