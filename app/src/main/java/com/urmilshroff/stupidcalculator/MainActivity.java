package com.urmilshroff.stupidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Stupid Calculator by Urmil Shroff", Toast.LENGTH_SHORT).show();
    }

    public void onAddButtonClick(View v)
    {
        EditText e1;
        EditText e2;
        int num1,num2,ans;

        e1=(EditText)findViewById(R.id.input01);
        e2=(EditText)findViewById(R.id.input02);

        num1=Integer.parseInt(e1.getText().toString());
        num2=Integer.parseInt(e2.getText().toString());

        ans=num1+num2;

        Toast.makeText(this, "Answer is "+ans, Toast.LENGTH_SHORT).show();
    }

    public void onSubButtonClick(View v)
    {
        EditText e1;
        EditText e2;
        int num1,num2,ans;

        e1=(EditText)findViewById(R.id.input01);
        e2=(EditText)findViewById(R.id.input02);

        num1=Integer.parseInt(e1.getText().toString());
        num2=Integer.parseInt(e2.getText().toString());

        ans=num1-num2;

        Toast.makeText(this, "Answer is "+ans, Toast.LENGTH_SHORT).show();
    }

    public void onMultButtonClick(View v)
    {
        EditText e1;
        EditText e2;
        int num1,num2,ans;

        e1=(EditText)findViewById(R.id.input01);
        e2=(EditText)findViewById(R.id.input02);

        num1=Integer.parseInt(e1.getText().toString());
        num2=Integer.parseInt(e2.getText().toString());

        ans=num1*num2;

        Toast.makeText(this, "Answer is "+ans, Toast.LENGTH_SHORT).show();
    }

    public void onDivButtonClick(View v)
    {
        EditText e1;
        EditText e2;
        int num1,num2,ans;

        e1=(EditText)findViewById(R.id.input01);
        e2=(EditText)findViewById(R.id.input02);

        num1=Integer.parseInt(e1.getText().toString());
        num2=Integer.parseInt(e2.getText().toString());

        ans=num1/num2;

        Toast.makeText(this, "Answer is "+ans, Toast.LENGTH_SHORT).show();
    }

    public void onModButtonClick(View v)
    {
        EditText e1;
        EditText e2;
        int num1,num2,ans;

        e1=(EditText)findViewById(R.id.input01);
        e2=(EditText)findViewById(R.id.input02);

        num1=Integer.parseInt(e1.getText().toString());
        num2=Integer.parseInt(e2.getText().toString());

        ans=num1%num2;

        Toast.makeText(this, "Answer is "+ans, Toast.LENGTH_SHORT).show();
    }
}