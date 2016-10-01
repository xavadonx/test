package com.example.zer.test3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_left, LeftFragment.newInstance(), LeftFragment.class.getSimpleName())
                .replace(R.id.fragment_right, RightFragment.newInstance(), RightFragment.class.getSimpleName())
                .commit();
    }
}
