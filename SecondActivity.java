package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    public final static String TAG="tag";
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity_layout);
        Intent in = getIntent();
        Bundle b = in.getExtras();
        int val1 = b.getInt("number1");
        int val2 = b.getInt("number2");
        Log.e(TAG,"val1="+val1);
        Log.e(TAG,"val2="+val2);

        Intent backIn = new Intent();
        backIn.putExtra("back",val1+val2+"");
        setResult(1002,backIn);

    }

}

