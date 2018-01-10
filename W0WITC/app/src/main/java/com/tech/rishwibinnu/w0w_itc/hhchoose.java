package com.tech.rishwibinnu.w0w_itc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hhchoose extends AppCompatActivity {

    public Button hhvisitbtn;
    public Button hhfollowupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hhchoose);
        hhvisitbtn = (Button) findViewById(R.id.hhfirstvisit);
        hhfollowupbtn = (Button) findViewById(R.id.hhfollowup);

        hhvisitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hhchoose.this,hhfv.class);
                startActivity(i);
            }
        });

        hhfollowupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hhchoose.this,hhfu.class);
            }
        });

    }
}
