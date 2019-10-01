package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.shoppingList.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;
    private EditText mFindStoreLocationText;

    private final int NUM_ITEMS = 10;
    private int itemCount = 0;
    private ArrayList<android.view.View> itemViewArray = new ArrayList<>();
    private TextView[] viewArray;
    public String[] itemStringArray = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArray("itemList_data", itemStringArray);
        outState.putInt("itemCount_data", itemCount);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFindStoreLocationText = findViewById(R.id.findStroreTextView);
        TextView mItem1 = findViewById(R.id.item1);
        TextView mItem2 = findViewById(R.id.item2);
        TextView mItem3 = findViewById(R.id.item3);
        TextView mItem4 = findViewById(R.id.item4);
        TextView mItem5 = findViewById(R.id.item5);
        TextView mItem6 = findViewById(R.id.item6);
        TextView mItem7 = findViewById(R.id.item7);
        TextView mItem8 = findViewById(R.id.item8);
        TextView mItem9 = findViewById(R.id.item9);
        TextView mItem10 = findViewById(R.id.item10);
        itemViewArray.add(mItem1);
        itemViewArray.add(mItem2);
        itemViewArray.add(mItem3);
        itemViewArray.add(mItem4);
        itemViewArray.add(mItem5);
        itemViewArray.add(mItem6);
        itemViewArray.add(mItem7);
        itemViewArray.add(mItem8);
        itemViewArray.add(mItem9);
        itemViewArray.add(mItem10);
        viewArray = new TextView[]{mItem1, mItem2, mItem3, mItem4, mItem5, mItem6, mItem7, mItem8, mItem9, mItem10};
/*        if (itemCount == NUM_ITEMS) {
            itemCount = 0;
        }*/
        // Restore the state.
        if (savedInstanceState != null) {
            itemStringArray = savedInstanceState.getStringArray("itemList_data");
            itemCount = savedInstanceState.getInt("itemCount_data");
        }
        populateList();

    }

    public void launchItemList(View view) {
        Log.d(LOG_TAG, "addItem button clicked");
        Intent intent = new Intent(this, AddItems.class);
        String message = "testing";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(AddItems.EXTRA_REPLY);
                Log.d(LOG_TAG, "reply: " + reply);
                //mItem1.setText(reply);
                itemStringArray[itemCount] = reply;
                itemCount++;
                populateList();
                //printStringList();
                //printArrayList();
            }
        }
        if (itemCount == NUM_ITEMS) {
            itemCount = 0;
        }
    }

    public void populateList() {
        for (int i = 0; i < NUM_ITEMS; i++) {
            TextView temp = viewArray[i];
            temp.setText(itemStringArray[i]);
            viewArray[i] = temp;
        }
    }
/*    public void populateList() {
        for (int i = 0; i < itemStringArray.length; i++) {
            TextView tempView = (TextView) itemViewArray.get(i);
            tempView.setText(itemStringArray[i]);
            itemViewArray.add(i, tempView);
        }
    }*/

    public void printStringList() {
        for (int i = 0; i < NUM_ITEMS; i++) {
            Log.d(LOG_TAG, "itemStringArray" + i + ":" + itemStringArray[i]);
        }
    }

    public void printArrayList() {
        int count = 0;
        for (View view : itemViewArray) {
            Log.d(LOG_TAG, "arrayList:" + count + " " + view);
            count++;
        }
    }

/*
*                 if(itemCount ==2){
                    itemCount = 0;
                }
                for(int i = 0; i < itemCount; i++){
                    Log.d(LOG_TAG,"itemStringArray" + i + ":" + itemStringArray[itemCount]);
                }
* */

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

    public void launchFindStore(View view) {
        //In the new openLocation() method, add a statement to get the string value of the mLocationEditText EditText.
        String loc = mFindStoreLocationText.getText().toString();
        //Parse that string into a Uri object with a geo search query:
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);

        //Create a new Intent with Intent.ACTION_VIEW as the action and loc as the data.
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        //Resolve the Intent and check to make sure that the Intent resolved successfully. If so, startActivity(), otherwise log an error message.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}
