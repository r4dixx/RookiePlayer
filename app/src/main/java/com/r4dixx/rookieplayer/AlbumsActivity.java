package com.r4dixx.rookieplayer;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class AlbumsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("Gojira", "Magma", R.drawable.album_art_gojira_magma));
        albums.add(new Album("Kaytranada", "99.9%", R.drawable.album_art_kaytranada_99percent));
        albums.add(new Album("Ivy Lab", "Death Don't Always Taste Good", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        albums.add(new Album("Not Scientists", "Golden Staples", R.drawable.album_art_not_scientists_golden_staples));


        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        GridView gridView = findViewById(R.id.albums_grid);
        gridView.setAdapter(adapter);
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_albums;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_albums;
    }

}
