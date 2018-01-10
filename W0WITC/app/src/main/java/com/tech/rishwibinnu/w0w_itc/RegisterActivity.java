package com.tech.rishwibinnu.w0w_itc;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {

    EditText pename;
    String s;
    EditText ngo;
    Spinner ngospinner;
    EditText city;
    Spinner cityspinner;
    EditText wardno;
    EditText wardname;
    Button regbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        pename = (EditText) findViewById(R.id.PEname);
        ngo = (EditText) findViewById(R.id.ngo);
        ngospinner = (Spinner) findViewById(R.id.ngospin);
        city = (EditText) findViewById(R.id.city);
        cityspinner = (Spinner) findViewById(R.id.cityspin);
        wardno = (EditText) findViewById(R.id.wardnumber);
        wardname = (EditText) findViewById(R.id.wardname);
        regbtn = (Button) findViewById(R.id.pesubmit);


        final ArrayAdapter<String> myadap = new ArrayAdapter<String>(RegisterActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ngos));
        myadap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ngospinner.setAdapter(myadap);
        ngospinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                s = myadap.getItem(i).toString();
                ngo.setText(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        final ArrayAdapter<String> myadap2 = new ArrayAdapter<String>(RegisterActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cities));
        myadap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cityspinner.setAdapter(myadap);
        cityspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                s = myadap.getItem(i).toString();
                city.setText(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedpref = getSharedPreferences("peinfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpref.edit();
                editor.putString("pename",pename.getText().toString());
                editor.putString("ngo",ngo.getText().toString());
                editor.putString("city",city.getText().toString());
                editor.putString("wardnumber",wardno.getText().toString());
                editor.putString("wardname",wardname.getText().toString());
                editor.apply();
                Intent intent = new Intent(RegisterActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });



}

}

