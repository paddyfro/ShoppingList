package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    public static final String LOG_TAG=SecondActivity.class.getSimpleName();
    public static final String EXTRA_REPLY = "com.example.shoppingList.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void launchAddItemToList(View view) {
        Log.d(LOG_TAG, "add eggs pressed");
        Button eggButton = findViewById(R.id.eggsButtonSecond);
        String mEggsButtonText = eggButton.getText().toString();
        Log.d(LOG_TAG, mEggsButtonText);
        Intent replyIntent = new Intent();
        replyIntent.putExtra("EXTRA_REPLY", mEggsButtonText);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}


/*
*     public static final String EXTRA_REPLY = "com.example.twoactivities.extra.REPLY";
    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mReply = findViewById(R.id.editText_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }*/