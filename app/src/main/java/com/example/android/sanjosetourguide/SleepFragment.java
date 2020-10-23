package com.example.android.sanjosetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of hotels.
 */
public class SleepFragment extends Fragment {

    public SleepFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.choice_list, container, false);

        // Create a list of hotel choices
        ArrayList<Choice> choices = new ArrayList<Choice>();
        choices.add(new Choice(R.string.fairmont, R.string.fairmont_address, R.drawable.fairmont));
        choices.add(new Choice(R.string.deanza, R.string.deanza_address, R.drawable.deanza));
        choices.add(new Choice(R.string.valencia, R.string.valencia_address, R.drawable.valencia));
        choices.add(new Choice(R.string.hyatt, R.string.hyatt_address, R.drawable.hyatt));
        choices.add(new Choice(R.string.marriott, R.string.marriott_address, R.drawable.marriott));
        choices.add(new Choice(R.string.hayesmansion, R.string.hayesmansion_address, R.drawable.hayesmansion));
        choices.add(new Choice(R.string.westin, R.string.westin_address, R.drawable.westin));

        // Create an {@link ChoiceAdapter}, whose data source is a list of {@link Choice}s. The
        // adapter knows how to create list items for each item in the list.
        ChoiceAdapter adapter = new ChoiceAdapter(getActivity(), choices, R.color.category_sleep);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // choice_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ChoiceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Choice} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}