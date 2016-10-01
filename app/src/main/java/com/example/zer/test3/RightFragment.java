package com.example.zer.test3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RightFragment extends Fragment implements ISender {

    private TextView label;

    public static RightFragment newInstance() {
        return new RightFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_right, container, false);
        label = (TextView) root.findViewById(R.id.fl_label);
        label.setText(getString(R.string.action));
        return root;
    }

    @Override
    public void sendText(String str) {
        label.setText(str);
    }
}
