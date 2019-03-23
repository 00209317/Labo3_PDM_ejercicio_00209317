package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView view1,view2,view3,view4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        view1 = findViewById(R.id.vista1);
        view2 = findViewById(R.id.vista2);
        view3 = findViewById(R.id.vista3);
        view4 = findViewById(R.id.vista4);

        Intent mIntent = getIntent();
        if (mIntent!=null){
            view1.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            view2.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            view3.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            view4.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }

    }
}
