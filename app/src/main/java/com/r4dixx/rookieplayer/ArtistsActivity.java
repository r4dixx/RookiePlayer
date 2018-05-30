package com.r4dixx.rookieplayer;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class ArtistsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Gojira", R.drawable.artist_art_gojira));
        artists.add(new Artist("Ivy Lab", R.drawable.artist_art_ivy_lab));
        artists.add(new Artist("Kaytranada", R.drawable.artist_art_kaytranada));
        artists.add(new Artist("Not Scientists", R.drawable.artist_art_not_scientists));


        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        GridView gridView = findViewById(R.id.artists_grid);
        gridView.setAdapter(adapter);
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_artists;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_artists;
    }
}
