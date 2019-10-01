package com.example.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSeconActvity1(View view) {
        Log.d(LOG_TAG, "click button 1");
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("EXTRA_INT", 1);
        startActivity(intent);
    }

    public void launchSeconActvity2(View view) {
        Log.d(LOG_TAG, "click button 2");
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("EXTRA_INT", 2);
        startActivity(intent);
    }

    public void launchSeconActvity3(View view) {
        Log.d(LOG_TAG, "click button 3");
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("EXTRA_INT", 3);
        startActivity(intent);
    }
}
