package com.calculator.rafaelsilva.calculator_android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btAddition;
    Button btSubtraction;
    Button btMultiplication;
    Button btDivision;

    TextView tvResultValue;

    EditText etNumber1;
    EditText etNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvResultValue = (TextView) findViewById(R.id.tvResultValue);

        etNumber1 = (EditText) findViewById(R.id.etNumber1);
        etNumber2 = (EditText) findViewById(R.id.etNumber2);

        btAddition = (Button) findViewById(R.id.btAddition);
        btSubtraction = (Button) findViewById(R.id.btSubtraction);
        btMultiplication = (Button) findViewById(R.id.btMultiplication);
        btDivision = (Button) findViewById(R.id.btDivision);

        btAddition.setOnClickListener(this);
        btSubtraction.setOnClickListener(this);
        btMultiplication.setOnClickListener(this);
        btDivision.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick(View view){
        if(view==btAddition){
            tvResultValue.setText("You clicked on the addition button");
        }

        if(view==btSubtraction){
            tvResultValue.setText("You clicked on the subtraction button");
        }
        if(view==btMultiplication){
            tvResultValue.setText("You clicked on the multiplication button");
        }
        if(view==btDivision){
            tvResultValue.setText("You clicked on the division button");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


