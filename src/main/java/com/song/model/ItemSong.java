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

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
