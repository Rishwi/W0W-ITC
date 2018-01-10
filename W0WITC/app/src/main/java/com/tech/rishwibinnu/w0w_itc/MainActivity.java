package com.tech.rishwibinnu.w0w_itc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences pref;
        SharedPreferences.Editor editor;
        pref = getSharedPreferences("peinfo", MODE_PRIVATE);
        editor = pref.edit();
        editor.putString("register","true");
        editor.commit();
        String getStatus=pref.getString("register", "nil");
        if(getStatus.equals("true"))
        {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent i = new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(i);

        }
    }
}
