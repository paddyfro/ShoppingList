package com.example.twopointtwohw;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int count = 0;
    private TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countTextView = findViewById(R.id.countTextView);
        if(savedInstanceState != null){
            count = savedInstanceState.getInt("count_data");
            String currentCount = Integer.toString(count);
            countTextView.setText(currentCount);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count_data", count);
    }

    public void launchUpdateCount(View view) {
        Log.d(LOG_TAG, "count button clicked");
        count++;
        String currentCount = Integer.toString(count);
        countTextView.setText(currentCount);
    }
}
