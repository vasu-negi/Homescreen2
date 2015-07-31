package com.vasu_negi.homescreen;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by vasu on 7/18/2015.
 */
public class Cardpojo implements Serializable {
Bitmap fav_image;
String fav_name;

    public Cardpojo(Bitmap fav_image, String fav_name) {
        this.fav_image = fav_image;
        this.fav_name = fav_name;
    }

    public Bitmap getFav_image() {
        return fav_image;
    }

    public void setFav_image(Bitmap fav_image) {
        this.fav_image = fav_image;
    }

    public String getFav_name() {
        return fav_name;
    }

    public void setFav_name(String fav_name) {
        this.fav_name = fav_name;
    }
}
