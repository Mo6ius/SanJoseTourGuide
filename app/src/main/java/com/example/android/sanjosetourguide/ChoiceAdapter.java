package com.example.android.sanjosetourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link ChoiceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Choice} objects.
 */
public class ChoiceAdapter extends ArrayAdapter<Choice> {

    /**
     * Resource ID for the background color for this list of choices
     */
    private int mColorResourceId;

    /**
     * Create a new {@link ChoiceAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param choices         is the list of {@link Choice}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of choices
     */
    public ChoiceAdapter(Context context, ArrayList<Choice> choices, int colorResourceId) {
        super(context, 0, choices);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Choice} object located at this position in the list
        Choice currentChoice = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID choice_text_view.
        TextView choiceTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the choice from the currentChoice object and set this text on
        // the choiceTextView.
        choiceTextView.setText(currentChoice.getName());

        // Find the TextView in the list_item.xml layout with the ID info_text_view.
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.address);
        // Get the info from the currentChoice object and set this text on
        // the infoTextView.
        infoTextView.setText(currentChoice.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set the ImageView to the image resource specified in the current Choice
        imageView.setImageResource(currentChoice.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}