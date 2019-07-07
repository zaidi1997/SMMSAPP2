package sg.edu.rp.c346.smmsapp2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class GeneratorFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_generator, container, false);


        String[] alTemplate = {"+65 9612 2112",
                "+65 9356 1322",
                "+65 9882 1253",
                "+65 9685 7474",
                "+65 9124 2123",
                "+65 9643 6875"};
        ListView listview = view.findViewById(R.id.listview3);

        ArrayAdapter<String> aaTemplate = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,alTemplate);
        listview.setAdapter(aaTemplate);

        return view;
    }
}

