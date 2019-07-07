package sg.edu.rp.c346.smmsapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;


public class MessageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);

        Button buttonGrp = view.findViewById(R.id.grpBtn);
        Button buttonTemplate = view.findViewById(R.id.templateBtn);
        Button buttonSend = view.findViewById(R.id.sendBtn);

        buttonGrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GroupFragment.class);
                startActivity(intent);
            }
        });

        buttonTemplate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TemplateFragment.class);
                startActivity(intent);
            }
        });


        return view;
    }
}

