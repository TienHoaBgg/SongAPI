package com.song.model;

public class ItemSong {
    String linkSong;
    String linkImage;
    String songName;

    public ItemSong(String linkSong, String linkImage, String songName) {
        this.linkSong = linkSong;
        this.linkImage = linkImage;
        this.songName = songName;
    }
    public ItemSong(){}

    public String getLinkSong() {
        return linkSong;
    }

    public void setLinkSong(String linkSong) {
        this.linkSong = linkSong;
    }

    public String getLinkImg() {
        return linkImage;
    }

    public void setLinkImg(String linkImage) {
        this.linkImage = linkImage;
    }

    public String getName() {
        return songName;
    }

    public void setName(String songName) {
        this.songName = songName;
    }
}
