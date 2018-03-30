package com.urmilshroff.stupidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
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
        //String checknull1,checknull2;

        e1=(EditText)findViewById(R.id.input01);
        e2=(EditText)findViewById(R.id.input02);

        num1=Integer.parseInt(e1.getText().toString()); //first it converts EditText to String and then integer
        num2=Integer.parseInt(e2.getText().toString());

        //checknull1=Integer.toString(num1);
        //checknull2=Integer.toString(num2);

        if(num1.matches(""))
        {
            Toast.makeText(this, "Empty", Toast.LENGTH_SHORT).show();
        }

        else
        {
            ans=num1+num2;
            Toast.makeText(this, "Answer is " + ans, Toast.LENGTH_SHORT).show();
        }
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