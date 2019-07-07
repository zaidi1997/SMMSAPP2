package sg.edu.rp.c346.smmsapp2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ReplyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reply, container, false);

        String[] alTemplate = {"Keyword: <UNSUB> | Thank you for unsubbing!",
                "Keyword: <WEBSITE> | Thank you for your interest. You will now be directed to our website!",
                "Keyword: <MORE> | Nulla bibendum fringilla elementum. Integer vitae enim molestie, iaculis elit maximus, eleifend nibh.",
                "Keyword: <CANCEL> | Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "Keyword: <ORDER> | Donec vitae risus molestie, faucibus nibh id, accumsan erat. Vestibulum volutpat dignissim neque, a semper ex aliquet at.",
                "Keyword: <REPORT> | Aenean id aliquet lectus, porttitor dapibus ligula. Integer accumsan ipsum ac congue finibus. Vivamus vestibulum nibh et ante ornare, id faucibus odio aliquet."};
        ListView listview = view.findViewById(R.id.listViewId);

        ArrayAdapter<String> aaTemplate = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,alTemplate);
        listview.setAdapter(aaTemplate);

        return view;


    }
}

