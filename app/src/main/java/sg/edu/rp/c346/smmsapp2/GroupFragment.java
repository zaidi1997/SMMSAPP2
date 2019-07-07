package sg.edu.rp.c346.smmsapp2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class GroupFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_group, container, false);

        String[] alTemplate = {"Girls",
                "Boys",
                "Older Clients",
                "Children",
                "Family",
                "Cousins"};
        ListView listview = view.findViewById(R.id.listview2);

        ArrayAdapter<String> aaTemplate = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,alTemplate);
        listview.setAdapter(aaTemplate);

        return view;
    }
}

