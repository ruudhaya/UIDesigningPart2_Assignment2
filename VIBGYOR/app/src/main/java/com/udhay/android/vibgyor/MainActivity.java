package com.udhay.android.vibgyor;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.Logger;


public class MainActivity extends Activity implements View.OnClickListener {


    TextView txtViolet, txtIndigo, txtBlue, txtRed, txtGreen, txtYellow, txtOrange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBlue     = (TextView)findViewById(R.id.blue);
        txtGreen    = (TextView)findViewById(R.id.green);
        txtIndigo   = (TextView)findViewById(R.id.indigo);
        txtOrange   = (TextView)findViewById(R.id.orange);
        txtRed      = (TextView)findViewById(R.id.red);
        txtViolet   = (TextView)findViewById(R.id.violet);
        txtYellow   = (TextView)findViewById(R.id.yellow);

        txtBlue.setOnClickListener(this);
        txtViolet.setOnClickListener(this);
        txtIndigo.setOnClickListener(this);
        txtGreen.setOnClickListener(this);
        txtYellow.setOnClickListener(this);
        txtOrange.setOnClickListener(this);
        txtRed.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String theText = "Test";
        theText = ((TextView)v).getText().toString();

        Log.w("VIBGYOR", "Clicked on : " + theText);
        Toast.makeText(this, "Clicked on : " + theText, Toast.LENGTH_LONG).show();
    }
}
