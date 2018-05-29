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
 * {@link AlbumAdapter} is a {@link ArrayAdapter} providing layout for each list based on pre-defined data source, which is a list of {@link Album objects}
 */


public class AlbumAdapter extends ArrayAdapter<Album> {

    /**
     * Custom constructor
     *
     * @param context to inflate the layout file
     * @param albums   is a list of Track objects to display in the list
     */
    public AlbumAdapter(Activity context, ArrayList<Album> albums) {
        // We initialize the ArrayAdapter for the context and the Tracks list
        // We're using 0 as second type argument because the adapter is not going to use it (it can be of any value)
        super(context, 0, albums);
    }

    /**
     * We provide a list item view for the AdapterView
     *
     * @param position    is the array position to be displayed in the list item view
     * @param convertView the recycled view to populate
     * @param parent      the parent ViewGroup used for inflation
     * @return the View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item_album, parent, false);
        }

        //Get the {@link Track} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the list_item_track.xmlck.xml layout. Then set the given text on the appropriate TextView
        TextView albumNameTextViw = gridItemView.findViewById(R.id.albums_album_name);
        albumNameTextViw.setText(currentAlbum.getAlbumName());
        TextView artistTextView = gridItemView.findViewById(R.id.albums_artist_name);
        artistTextView.setText(currentAlbum.getArtistName());
        ImageView albumImageView = gridItemView.findViewById(R.id.albums_album_art);
        albumImageView.setImageResource(currentAlbum.getAlbumArt());

        // Return the whole list item layout (containing 1 TextView so it can be shown in the ListView)
        return gridItemView;
    }
}
