package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    public final static String TAG="tag";
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity_layout);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent in = new Intent(FirstActivity.this,SecondActivity.class);
                Bundle b = new Bundle();
                b.putInt("number1",100);
                b.putInt("number2",200);
                in.putExtras(b);
                startActivityForResult(in,1001);
            }
        });
    }

    protected void onActivityResult(int requestCode,int resultCode,@Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        Log.e(TAG,"data=val1+val2="+data.getStringExtra("back"));
    }



}

