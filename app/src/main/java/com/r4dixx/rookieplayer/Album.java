package com.r4dixx.rookieplayer;

public class Album {
    private String mArtistName;
    private String mAlbumName;
    private int mAlbumArt;

    public Album(String artistName, String albumName, int albumArt) {
        mArtistName = artistName;
        mAlbumName = albumName;
        mAlbumArt = albumArt;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public int getAlbumArt() {
        return mAlbumArt;
    }

}
