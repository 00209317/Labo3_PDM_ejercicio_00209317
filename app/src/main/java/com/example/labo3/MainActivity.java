package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEdit1,mEdit2,mEdit3,mEdit4;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Busco mis editText y mi boton por sus ids y se los cargo a mis variables
        mEdit1 = findViewById(R.id.edi1);
        mEdit2 = findViewById(R.id.edi2);
        mEdit3 = findViewById(R.id.edi3);
        mEdit4 = findViewById(R.id.edi4);
        mButton = findViewById(R.id.btnsend);

        mButton.setOnClickListener(v ->{
            String text1 = mEdit1.getText().toString();
            String text2 = mEdit2.getText().toString();
            String text3 = mEdit3.getText().toString();
            String text4 = mEdit4.getText().toString();

            Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
            mIntent.putExtra("key1", text1);
            mIntent.putExtra("key2", text2);
            mIntent.putExtra("key3", text3);
            mIntent.putExtra("key4", text4);
            startActivity(mIntent);
        });




    }
}
