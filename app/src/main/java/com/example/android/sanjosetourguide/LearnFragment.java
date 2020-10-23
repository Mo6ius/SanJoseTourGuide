package com.example.android.sanjosetourguide;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ListView;

        import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of museums.
 */
public class LearnFragment extends Fragment {

    public LearnFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.choice_list, container, false);

        // Create a list of museum choices
        ArrayList<Choice> choices = new ArrayList<Choice>();
        choices.add(new Choice(R.string.japanmuseum, R.string.japanmuseum_address, R.drawable.japanmuseum));
        choices.add(new Choice(R.string.portuguesemuseum, R.string.portuguesemuseum_address, R.drawable.portuguesemuseum));
        choices.add(new Choice(R.string.rosicrucian, R.string.rosicrucian_address, R.drawable.rosicrucian));
        choices.add(new Choice(R.string.mcenerycenter, R.string.mcenerycenter_address, R.drawable.mcenerycenter));
        choices.add(new Choice(R.string.vietmuseum, R.string.vietmuseum_address, R.drawable.vietmuseum));
        choices.add(new Choice(R.string.winchester, R.string.winchester_address, R.drawable.winchester));

        // Create an {@link ChoiceAdapter}, whose data source is a list of {@link Choice}s. The
        // adapter knows how to create list items for each item in the list.
        ChoiceAdapter adapter = new ChoiceAdapter(getActivity(), choices, R.color.category_learn);

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