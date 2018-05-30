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
 * {@link TrackAdapter} is a {@link ArrayAdapter} providing layout for each list based on pre-defined data source, which is a list of {@link Track objects}
 */


public class TrackAdapter extends ArrayAdapter<Track> {

    /**
     * Custom constructor
     *
     * @param context to inflate the layout file
     * @param tracks   is a list of Track objects to display in the list
     */
    public TrackAdapter(Activity context, ArrayList<Track> tracks) {
        // We initialize the ArrayAdapter for the context and the Track list
        // We're using 0 as second type argument because the adapter is not going to use it (it can be of any value)
        super(context, 0, tracks);
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
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_track, parent, false);
        }

        //Get the {@link Track} object located at this position in the list
        Track currentTrack = getItem(position);

        // Find the TextView in the list_item_track.xml layout. Then set the given texts on the appropriate TextViews and the given image on the appropriate ImageView
        TextView trackTextView = listItemView.findViewById(R.id.tracks_track_title);
        trackTextView.setText(currentTrack.getTrackTitle());
        TextView artistTextView = listItemView.findViewById(R.id.tracks_artist_name);
        artistTextView.setText(currentTrack.getArtistName());
        ImageView albumImageView = listItemView.findViewById(R.id.tracks_album_art);
        albumImageView.setImageResource(currentTrack.getAlbumArt());

        // Return the whole list item layout (containing 2 TextViews and 1 ImageView so they can be shown in the ListView)
        return listItemView;
    }
}
