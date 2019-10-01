package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AddItems extends AppCompatActivity {
    private static final String LOG_TAG = AddItems.class.getSimpleName();
    public static final String EXTRA_REPLY = "com.example.addItems.extra.REPLY";
    private Button mReply1;
    private Button mReply2;
    private Button mReply3;
    private Button mReply4;
    private Button mReply5;
    private Button mReply6;
    private Button mReply7;
    private Button mReply8;
    private Button mReply9;
    private Button mReply10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Log.d(LOG_TAG, "msg" + message);
        mReply1 = findViewById(R.id.eggsButton);
        mReply2 = findViewById(R.id.milkButton);
        mReply3 = findViewById(R.id.breadButton);
        mReply4 = findViewById(R.id.cheeseButton);
        mReply5 = findViewById(R.id.minceButton);
        mReply6 = findViewById(R.id.rumButton);
        mReply7 = findViewById(R.id.ketchupButton);
        mReply8 = findViewById(R.id.toiletRollButton);
        mReply9 = findViewById(R.id.cokeButton);
        mReply10 = findViewById(R.id.mucnhButton);
    }

    public void sendItemToMain(String item){
        Intent replyIntent = new Intent();
        Log.d(LOG_TAG, "item: " + item);
        replyIntent.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void launchAddItem1(View view) {
        Log.d(LOG_TAG, "clicked launchAddItem1");
        String reply = mReply1.getText().toString();
        Log.d(LOG_TAG, "reply: " + reply);
        sendItemToMain(reply);
    }

    public void launchAddItem2(View view) {
        Log.d(LOG_TAG, "clicked launchAddItem2");
        String reply = mReply2.getText().toString();
        Log.d(LOG_TAG, "reply: " + reply);
        sendItemToMain(reply);
    }

    public void launchAddItem3(View view) {
        Log.d(LOG_TAG, "clicked launchAddItem3");
        String reply = mReply3.getText().toString();
        Log.d(LOG_TAG, "reply: " + reply);
        sendItemToMain(reply);
    }

    public void launchAddItem4(View view) {
        Log.d(LOG_TAG, "clicked launchAddItem4");
        String reply = mReply4.getText().toString();
        Log.d(LOG_TAG, "reply: " + reply);
        sendItemToMain(reply);
    }

    public void launchAddItem5(View view) {
        Log.d(LOG_TAG, "clicked launchAddItem5");
        String reply = mReply5.getText().toString();
        Log.d(LOG_TAG, "reply: " + reply);
        sendItemToMain(reply);
    }

    public void launchAddItem6(View view) {
        Log.d(LOG_TAG, "clicked launchAddItem6");
        String reply = mReply6.getText().toString();
        Log.d(LOG_TAG, "reply: " + reply);
        sendItemToMain(reply);
    }
    public void launchAddItem7(View view) {
        Log.d(LOG_TAG, "clicked launchAddItem7");
        String reply = mReply7.getText().toString();
        Log.d(LOG_TAG, "reply: " + reply);
        sendItemToMain(reply);
    }
    public void launchAddItem8(View view) {
        Log.d(LOG_TAG, "clicked launchAddItem8");
        String reply = mReply8.getText().toString();
        Log.d(LOG_TAG, "reply: " + reply);
        sendItemToMain(reply);
    }
    public void launchAddItem9(View view) {
        Log.d(LOG_TAG, "clicked launchAddItem9");
        String reply = mReply9.getText().toString();
        Log.d(LOG_TAG, "reply: " + reply);
        sendItemToMain(reply);
    }
    public void launchAddItem10(View view) {
        Log.d(LOG_TAG, "clicked launchAddItem10");
        String reply = mReply10.getText().toString();
        Log.d(LOG_TAG, "reply: " + reply);
        sendItemToMain(reply);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}
