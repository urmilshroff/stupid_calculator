package com.urmilshroff.stupidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onButtonClick(View v)
    {
        TextView t1;
        EditText e1;
        EditText e2;
        int num1, num2, ans;

        e1 = (EditText) findViewById(R.id.input01);
        e2 = (EditText) findViewById(R.id.input02);

        t1 = (TextView) findViewById(R.id.output);

        num1 = Integer.parseInt(e1.getText().toString());
        num2 = Integer.parseInt(e2.getText().toString());
        ans = num1 + num2;
        t1.setText(Integer.toString(ans));
    }
}