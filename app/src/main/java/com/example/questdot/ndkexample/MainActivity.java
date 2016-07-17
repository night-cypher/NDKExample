package com.example.questdot.ndkexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static{
        System.loadLibrary("MyLibrary");
    }

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);

        TestNDK testNDK= new TestNDK();

        textView.setText(""+testNDK.getNDKString());

    }
}
