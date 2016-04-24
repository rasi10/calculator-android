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
        Calculator calculator = new Calculator();
        double number1=0.0;
        double number2 = 0.0;
        double result = 0.0;

        number1 = Double.parseDouble(etNumber1.getText().toString());
        number2 = Double.parseDouble(etNumber2.getText().toString());

        if(view==btAddition){
            result = calculator.addition(number1, number2);
            tvResultValue.setText(String.valueOf(result));
        }

        if(view==btSubtraction){
            result = calculator.subtraction(number1, number2);
            tvResultValue.setText(String.valueOf(result));

        }
        if(view==btMultiplication){
            result = calculator.multiplication(number1, number2);
            tvResultValue.setText(String.valueOf(result));
        }

        if(view==btDivision){
            result = calculator.division(number1, number2);
            if (result==-1.57222){
                tvResultValue.setText("You can not perform division by zero");
            }else{
                tvResultValue.setText(String.valueOf(result));
            }


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


