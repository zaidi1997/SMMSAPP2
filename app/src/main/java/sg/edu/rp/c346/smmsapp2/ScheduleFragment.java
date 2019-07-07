package sg.edu.rp.c346.smmsapp2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ScheduleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        String[] alTemplate = {"Keyword: <UNSUB> | Group: <Family> | Thank you for unsubbing!",
                "Keyword: <Youth> | Group: <Youth> | Hello youths of today, call 999 for more information.",
                "Keyword: <WEBSITE> | Group: <Clients> | Thank you for your interest. You will now be directed to our website!",
                "Keyword: <REPORT> | Group: <Friends> | Aenean id aliquet lectus, porttitor dapibus ligula. Integer accumsan ipsum ac congue finibus. Vivamus vestibulum nibh et ante ornare, id faucibus odio aliquet."};
        ListView listview = view.findViewById(R.id.listview2);

        ArrayAdapter<String> aaTemplate = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,alTemplate);
        listview.setAdapter(aaTemplate);

        return view;
    }
}

