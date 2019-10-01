package com.example.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        int articleNum = intent.getIntExtra("EXTRA_INT", 0);
        TextView textView = findViewById(R.id.article);
        if(articleNum ==1){
            textView.setText(R.string.textOne);
        }else if(articleNum ==2){
            textView.setText(R.string.textTwo);
        }else if(articleNum ==3){
            textView.setText(R.string.textThree);
        }else{
            textView.setText("no button pressed, how did you get here?");
        }

    }
}
