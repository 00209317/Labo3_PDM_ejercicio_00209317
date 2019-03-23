package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView txv1,txv2,txv3,txv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txv1 = findViewById(R.id.tv1);
        txv2 = findViewById(R.id.tv2);
        txv3 = findViewById(R.id.tv3);
        txv4 = findViewById(R.id.tv4);

        Intent mIntent = getIntent();
        if (mIntent!=null){
            txv1.setText(mIntent.getStringExtra("key1"));
            txv2.setText(mIntent.getStringExtra("key2"));
            txv3.setText(mIntent.getStringExtra("key3"));
            txv4.setText(mIntent.getStringExtra("key4"));
        }
    }
}
