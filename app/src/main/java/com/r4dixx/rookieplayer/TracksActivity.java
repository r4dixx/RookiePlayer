package com.r4dixx.rookieplayer;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TracksActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("The Shooting Star", "Gojira", R.drawable.album_art_gojira_magma));
        tracks.add(new Track("Silvera", "Gojira", R.drawable.album_art_gojira_magma));
        tracks.add(new Track("The Cell", "Gojira", R.drawable.album_art_gojira_magma));
        tracks.add(new Track("Stranded", "Gojira", R.drawable.album_art_gojira_magma));
        tracks.add(new Track("Yellow Stone", "Gojira", R.drawable.album_art_gojira_magma));
        tracks.add(new Track("Magma", "Gojira", R.drawable.album_art_gojira_magma));
        tracks.add(new Track("Pray", "Gojira", R.drawable.album_art_gojira_magma));
        tracks.add(new Track("Only Pain", "Gojira", R.drawable.album_art_gojira_magma));
        tracks.add(new Track("Low Lands", "Gojira", R.drawable.album_art_gojira_magma));
        tracks.add(new Track("Liberation", "Gojira", R.drawable.album_art_gojira_magma));
        tracks.add(new Track("Track Uno", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Bus Ride", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Got It Good", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Together", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Drive Me Crazy", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Weight Off", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("One Too Many", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Despite The Weather", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Glowed Up", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Breakdance Lesson N.1", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("You're The One", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Vivid Dreams", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Lite Spots", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Leave Me Alone", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Bullets", "Kaytranada", R.drawable.album_art_kaytranada_99percent));
        tracks.add(new Track("Just About Ready To Beg", "Not Scientists", R.drawable.album_art_not_scientists_golden_staples));
        tracks.add(new Track("Perfect World", "Not Scientists", R.drawable.album_art_not_scientists_golden_staples));
        tracks.add(new Track("Sky On Fire", "Not Scientists", R.drawable.album_art_not_scientists_golden_staples));
        tracks.add(new Track("Orientation", "Not Scientists", R.drawable.album_art_not_scientists_golden_staples));
        tracks.add(new Track("Golden Staples", "Not Scientists", R.drawable.album_art_not_scientists_golden_staples));
        tracks.add(new Track("Mechanical Reaction", "Not Scientists", R.drawable.album_art_not_scientists_golden_staples));
        tracks.add(new Track("Paper Crown", "Not Scientists", R.drawable.album_art_not_scientists_golden_staples));
        tracks.add(new Track("Dark Tornado", "Not Scientists", R.drawable.album_art_not_scientists_golden_staples));
        tracks.add(new Track("Submarine", "Not Scientists", R.drawable.album_art_not_scientists_golden_staples));
        tracks.add(new Track("Emergency Break", "Not Scientists", R.drawable.album_art_not_scientists_golden_staples));
        tracks.add(new Track("Fortune Teller", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("Ugly Bubble", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("Jet Lag", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("Astral Pirate Theme", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("Cake", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("Vanity Fair", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("A & E", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("Death Don't Always Taste Good", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("Snack Time", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("Calculate", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("Ozbo", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));
        tracks.add(new Track("Cadillac", "Ivy Lab", R.drawable.album_art_ivy_lab_death_dont_always_taste_good));

        TrackAdapter adapter = new TrackAdapter(this, tracks);
        ListView listView = findViewById(R.id.tracks_list);
        listView.setAdapter(adapter);
    }

    @Override
    int getContentViewId() {
        return R.layout.activity_tracks;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_tracks;
    }

}
