package com.r4dixx.rookieplayer;

public class Track {
    private String mTrack;
    private String mArtistName;
    private int mAlbumArt;

    public Track(String trackTitle, String artistName, int albumArt) {
        mTrack = trackTitle;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

    public String getTrackTitle() {
        return mTrack;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getAlbumArt() {
        return mAlbumArt;
    }

}
