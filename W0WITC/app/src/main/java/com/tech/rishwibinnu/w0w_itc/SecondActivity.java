package com.tech.rishwibinnu.w0w_itc;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    ImageButton hhbtn;
    ImageButton scbtn;
    ImageButton hubbtn;
    ImageButton cobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        hhbtn = (ImageButton) findViewById(R.id.household);
        scbtn = (ImageButton) findViewById(R.id.school);
        hubbtn = (ImageButton) findViewById(R.id.hub);
        cobtn = (ImageButton) findViewById(R.id.corporate);

        hhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,hhchoose.class);
                startActivity(intent);

            }
        });

        scbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SecondActivity.this,schoolchoose.class);
                startActivity(intent);

            }
        });

        hubbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this,hubcollection.class);
                startActivity(intent);


            }
        });

        cobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this,corpchoose.class);
                startActivity(intent);


            }
        });
    }
}
