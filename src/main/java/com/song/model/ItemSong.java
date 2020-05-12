package com.song.model;

public class ItemSong {
    String linkSong;
    String linkImg;
    String name;

    public ItemSong(String linkSong, String linkImg, String name) {
        this.linkSong = linkSong;
        this.linkImg = linkImg;
        this.name = name;
    }
    public ItemSong(){}

    public String getLinkSong() {
        return linkSong;
    }

    public void setLinkSong(String linkSong) {
        this.linkSong = linkSong;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
