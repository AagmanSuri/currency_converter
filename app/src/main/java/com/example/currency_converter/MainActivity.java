package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void  convert (View view){
        ImageView run = (ImageView) findViewById(R.id.imageView);
        run.setImageResource(R.drawable.usd);

        EditText text = (EditText) findViewById(R.id.editText);


        String amountinrs = text.getText().toString();
        double d= Double.parseDouble(amountinrs);
        double amountiusd = d /76.50;
        String l = Double.toString(amountiusd);

        Log.i("this","amount in usd is" + l);
        Toast.makeText(this,  "the amount in usd is" + l, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
