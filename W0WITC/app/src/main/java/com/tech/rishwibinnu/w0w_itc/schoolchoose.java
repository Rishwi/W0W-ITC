package com.tech.rishwibinnu.w0w_itc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class schoolchoose extends AppCompatActivity {

    public Button schoolvisit;
    public Button schoolpropagation;
    public Button schoolisrc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schoolchoose);

        schoolvisit = (Button) findViewById(R.id.scvisit);
        schoolpropagation = (Button) findViewById(R.id.scprop);
        schoolisrc = (Button) findViewById(R.id.scisrc);

        schoolvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(schoolchoose.this,scvisit.class);
                startActivity(i);
            }
        });

        schoolpropagation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(schoolchoose.this,scprop.class);
                startActivity(intent);
            }
        });

        schoolisrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(schoolchoose.this,scisrc.class);
                startActivity(i);
            }
        });

    }
}
