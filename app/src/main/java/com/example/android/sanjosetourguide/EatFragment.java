package com.example.android.sanjosetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants.
 */
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.choice_list, container, false);

        // Create a list of restaurant choices
        ArrayList<Choice> choices = new ArrayList<Choice>();
        choices.add(new Choice(R.string.japantown, R.string.japantown_address, R.drawable.japantown));
        choices.add(new Choice(R.string.littleitaly, R.string.littleitaly_address, R.drawable.littleitaly));
        choices.add(new Choice(R.string.fleamarket, R.string.fleamarket_address, R.drawable.fleamarket));
        choices.add(new Choice(R.string.sanpedro, R.string.sanpedro_address, R.drawable.sanpedro));
        choices.add(new Choice(R.string.sanatarow, R.string.santanarow_address, R.drawable.santanarow));
        choices.add(new Choice(R.string.vietnamtown, R.string.vietnamtown_address, R.drawable.vietnamtown));

        // Create an {@link ChoiceAdapter}, whose data source is a list of {@link Choice}s. The
        // adapter knows how to create list items for each item in the list.
        ChoiceAdapter adapter = new ChoiceAdapter(getActivity(), choices, R.color.category_eat);

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