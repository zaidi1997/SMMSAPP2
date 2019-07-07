package sg.edu.rp.c346.smmsapp2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TemplateFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_template, container, false);

        String[] alTemplate = {"Thank you for signing up for updates with us!",
                "Weekend promo begins today! Use coupon 'OFF50' for %50 off!",
        "Chrysler sale has begun. Visit our website at www.youtube.com for sales beyond your wildest imagination!",
        "Merry crisis everyone! Thank you for the support youve shown. Here's a free $5 coupon. 'ty5'"};
        ListView listview = view.findViewById(R.id.listViewId);

        ArrayAdapter<String> aaTemplate = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,alTemplate);
        listview.setAdapter(aaTemplate);

        return view;
    }
}

