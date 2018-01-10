package com.tech.rishwibinnu.w0w_itc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class corpchoose extends AppCompatActivity {

    public Button corpbtn;
    public Button corpcollectionbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corpchoose);

        corpbtn = (Button) findViewById(R.id.corp);
        corpcollectionbtn = (Button) findViewById(R.id.corpcollection);

        corpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(corpchoose.this,corporate.class);
                startActivity(intent);
            }
        });

        corpcollectionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(corpchoose.this,corporatecollection.class);
                startActivity(intent);
            }
        });

    }
}
