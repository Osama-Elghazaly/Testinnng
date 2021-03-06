    package com.example.chapter3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double costPerTicket=79.99;
    int  numberOfTickets;
    double totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tickets=(EditText) findViewById(R.id.txtTickets);
        final Spinner spinner=(Spinner)findViewById(R.id.spinner);
        Button bttnGo=(Button)findViewById(R.id.button);



//intent:takes me from one activity to another (navigation)


    bttnGo.setOnClickListener(new View.OnClickListener() {
        final TextView result = (TextView) findViewById(R.id.txtResult);

        @Override
        public void onClick(View v) {
            DecimalFormat currency = new DecimalFormat("$###,###.##");
            try {
                numberOfTickets = Integer.parseInt(tickets.getText().toString());
                totalCost = numberOfTickets * costPerTicket;
                groupChoice = spinner.getSelectedItem().toString();

                result.setText(String.format("Cost for " + groupChoice + " is " + currency.format(totalCost)));
            }
            catch(Exception e){

            }


        }


    });


    }
}