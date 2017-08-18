package com.example.alfurquan.androidmusicplayer;

/**
 * Created by ALFURQUAN on 30-06-2017.
 */
public class Playlist {

    String name;
    int thumbnail;

    public Playlist(String name,int thumbnail)
    {
        this.name=name;
        this.thumbnail=thumbnail;
     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
