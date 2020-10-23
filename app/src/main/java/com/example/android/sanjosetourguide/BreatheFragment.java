package com.example.android.sanjosetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of parks.
 */
public class BreatheFragment extends Fragment {

    public BreatheFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.choice_list, container, false);

        // Create a list of park choices
        ArrayList<Choice> choices = new ArrayList<Choice>();
        choices.add(new Choice(R.string.almaden, R.string.almaden_address, R.drawable.almaden));
        choices.add(new Choice(R.string.alumrock, R.string.alumrock_address, R.drawable.alumrock));
        choices.add(new Choice(R.string.emmaprusch, R.string.emmaprusch_address, R.drawable.emmaprusch));
        choices.add(new Choice(R.string.happyhollow, R.string.happyhollow_address, R.drawable.happyhollow));
        choices.add(new Choice(R.string.kelleypark, R.string.kelleypark_address, R.drawable.kelleypark));
        choices.add(new Choice(R.string.rosegarden, R.string.rosegarden_address, R.drawable.rosegarden));

        // Create an {@link ChoiceAdapter}, whose data source is a list of {@link Choice}s. The
        // adapter knows how to create list items for each item in the list.
        ChoiceAdapter adapter = new ChoiceAdapter(getActivity(), choices, R.color.category_breathe);

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