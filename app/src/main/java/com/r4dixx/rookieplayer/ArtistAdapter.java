package com.r4dixx.rookieplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link ArtistAdapter} is a {@link ArrayAdapter} providing layout for each list based on pre-defined data source, which is a list of {@link Artist objects}
 */


public class ArtistAdapter extends ArrayAdapter<Artist> {

    /**
     * Custom constructor
     *
     * @param context to inflate the layout file
     * @param artists   is a list of Artist objects to display in the grid
     */
    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        // We initialize the ArrayAdapter for the context and the Artist list
        // We're using 0 as second type argument because the adapter is not going to use it (it can be of any value)
        super(context, 0, artists);
    }

    /**
     * We provide a grid item view for the AdapterView
     *
     * @param position    is the array position to be displayed in the grid item view
     * @param convertView the recycled view to populate
     * @param parent      the parent ViewGroup used for inflation
     * @return the View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item_artist, parent, false);
        }

        //Get the {@link Artist} object located at this position in the list
        Artist currentArtist = getItem(position);

        // Find the TextView in the grid_item_artist.xml layout. Then set the given text on the appropriate TextView and the given image on the appropriate ImageView
        TextView artistTextView = gridItemView.findViewById(R.id.artists_artist_name);
        artistTextView.setText(currentArtist.getArtistName());
        ImageView artistImageView = gridItemView.findViewById(R.id.artists_artist_art);
        artistImageView.setImageResource(currentArtist.getAlbumArt());

        // Return the whole grid item layout (containing 1 TextView and 1 ImageView so they can be shown in the GridView)
        return gridItemView;
    }
}
