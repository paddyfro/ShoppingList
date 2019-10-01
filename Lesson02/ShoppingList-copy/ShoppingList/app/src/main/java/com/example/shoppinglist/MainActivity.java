package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    private TextView mTextViewOne;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextViewOne = findViewById(R.id.itemOne);
    }

    public void launchAddItem(View view) {
        Log.d("Main activity", "add item pressed");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == TEXT_REQUEST){
            if(resultCode == RESULT_OK){
                String itemToAdd = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                mTextViewOne.setText(itemToAdd);
                Log.d(LOG_TAG, "egs?"+ itemToAdd);
            }
        }
    }
}
