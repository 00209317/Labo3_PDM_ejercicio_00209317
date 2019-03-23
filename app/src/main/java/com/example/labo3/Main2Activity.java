package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView txv1,txv2,txv3,txv4;
    private Button mShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txv1 = findViewById(R.id.tv1);
        txv2 = findViewById(R.id.tv2);
        txv3 = findViewById(R.id.tv3);
        txv4 = findViewById(R.id.tv4);
        mShare = findViewById(R.id.btnshare);


        Intent mIntent = getIntent();
        if (mIntent!=null){
            txv1.setText(mIntent.getStringExtra("key1"));
            txv2.setText(mIntent.getStringExtra("key2"));
            txv3.setText(mIntent.getStringExtra("key3"));
            txv4.setText(mIntent.getStringExtra("key4"));
        }


        mShare.setOnClickListener(v -> {
            String text1 = txv1.getText().toString();
            String text2 = txv2.getText().toString();
            String text3 = txv3.getText().toString();
            String text4 = txv4.getText().toString();

            Intent mIn = new Intent();
            mIn.setType("text/plain");
            mIn.setAction(Intent.ACTION_SEND);
            mIn.putExtra(Intent.EXTRA_TEXT, text1);
            mIn.putExtra(Intent.EXTRA_TEXT, text2);
            mIn.putExtra(Intent.EXTRA_TEXT, text3);
            mIn.putExtra(Intent.EXTRA_TEXT, text4);
            startActivity(mIn);

        });




    }
}
