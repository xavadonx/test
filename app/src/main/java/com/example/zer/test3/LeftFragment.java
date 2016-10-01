package com.example.zer.test3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LeftFragment extends Fragment {

    private Button action;

    public static LeftFragment newInstance() {
        return new LeftFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_left, container, false);
        action = (Button) root.findViewById(R.id.fl_action);
        action.setText(getString(R.string.action));
        return root;
    }
}
