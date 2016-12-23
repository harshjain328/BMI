package com.bmi;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText feet,inc,weight;
    TextView bmi;
    Button cal;
    //DecimalFormat df=new DecimalFormat("#.0000");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        feet=(EditText)findViewById(R.id.edFeet);
        weight=(EditText)findViewById(R.id.edKg);
        bmi=(TextView)findViewById(R.id.txtBmi);
        cal=(Button)findViewById(R.id.button);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double met=Double.parseDouble(feet.getText().toString());
                met=met*0.3048;



                met=met*met;

                //met=(double)Math.round(met*10000) / 10000;

                Toast.makeText(MainActivity.this,met.toString(),Toast.LENGTH_LONG).show();

                Double temp=Double.parseDouble(weight.getText().toString());

                temp=temp/met;

                temp=(double)Math.round(temp*100) / 100;

                //Toast.makeText(MainActivity.this,temp.toString(),Toast.LENGTH_LONG).show();
                bmi.setText(temp.toString());
            }
        });
    }
}
