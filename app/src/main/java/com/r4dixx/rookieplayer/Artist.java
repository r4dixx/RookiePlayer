package com.r4dixx.rookieplayer;

public class Artist {
    private String mArtistName;
    private int mArtistArt;

    public Artist(String artistName, int albumArt) {
        mArtistName = artistName;
        mArtistArt = albumArt;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getAlbumArt() {
        return mArtistArt;
    }

}
