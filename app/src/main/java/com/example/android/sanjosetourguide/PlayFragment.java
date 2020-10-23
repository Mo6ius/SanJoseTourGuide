package com.example.android.sanjosetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of attractions.
 */
public class PlayFragment extends Fragment {

    public PlayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.choice_list, container, false);

        // Create a list of attraction choices
        ArrayList<Choice> choices = new ArrayList<Choice>();
        choices.add(new Choice(R.string.m8trix, R.string.m8trix_address, R.drawable.m8trix));
        choices.add(new Choice(R.string.csz, R.string.csz_address, R.drawable.csz));
        choices.add(new Choice(R.string.omescape, R.string.omescape_address, R.drawable.omescape));
        choices.add(new Choice(R.string.ragingwaters, R.string.ragingwaters_address, R.drawable.ragingwaters));
        choices.add(new Choice(R.string.trampoline, R.string.trampoline_address, R.drawable.trampoline));
        choices.add(new Choice(R.string.sap, R.string.sap_address, R.drawable.sap));

        // Create an {@link ChoiceAdapter}, whose data source is a list of {@link Choice}s. The
        // adapter knows how to create list items for each item in the list.
        ChoiceAdapter adapter = new ChoiceAdapter(getActivity(), choices, R.color.category_play);

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