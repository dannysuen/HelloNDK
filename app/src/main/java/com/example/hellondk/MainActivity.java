package com.example.hellondk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView label = (TextView) findViewById(R.id.label);
        label.setText(sayHello());
    }

    // new code
    static {
        System.loadLibrary("hello-android-jni");
    }
    public native String sayHello();
}
