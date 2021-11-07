package com.renu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String TAG="MainActivity";
    TextView result , advance_title;

    Button one_btu , two_btu , three_btu , four_btu , five_btu , six_btu, seven_btu ,
            eight_btu , nine_btu , zero_btu;

    Button clear_btu;

    Button equal_btu , plus_btu , minus_btu , time_btu , divided_btu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViewmethod();
        setClicklistner();
    }

    private void setClicklistner() {
        one_btu.setOnClickListener(this);
        two_btu.setOnClickListener(this);
        three_btu.setOnClickListener(this);
        four_btu.setOnClickListener(this);
        five_btu.setOnClickListener(this);
        six_btu.setOnClickListener(this);
        seven_btu.setOnClickListener(this);
        eight_btu.setOnClickListener(this);
        nine_btu.setOnClickListener(this);
        zero_btu.setOnClickListener(this);
        equal_btu.setOnClickListener(this);
        minus_btu.setOnClickListener(this);
        time_btu.setOnClickListener(this);
        divided_btu.setOnClickListener(this);
        plus_btu.setOnClickListener(this);
        clear_btu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.one_btu:
                result.setText(result.getText() + "1");
                Calculation.push("1");
                break;
            case R.id.two_btu:
                result.setText(result.getText() + "2");
                Calculation.push("2");
                break;
            case R.id.three_btu:
                result.setText(result.getText() + "3");
                Calculation.push("3");
                break;
            case R.id.four_btu:
                result.setText(result.getText() + "4");
                Calculation.push("4");
                break;
            case R.id.five_btu:
                result.setText(result.getText() + "5");
                Calculation.push("5");
                break;
            case R.id.six_btu:
                result.setText(result.getText() + "6");
                Calculation.push("6");
                break;
            case R.id.seven_btu:
                result.setText(result.getText() + "7");
                Calculation.push("7");
                break;
            case R.id.eight_btu:
                result.setText(result.getText() + "8");
                Calculation.push("8");
                break;
            case R.id.nine_btu:
                result.setText(result.getText() + "9");
                Calculation.push("9");
                break;
            case R.id.zero_btu:
                result.setText(result.getText() + "0");
                Calculation.push("0");
                break;
            case R.id.plus_btu:
                result.setText(result.getText() + "+");
                Calculation.push("+");
                break;
            case R.id.minus_btu:
                result.setText(result.getText() + "-");
                Calculation.push("-");
                break;
            case R.id.time_btu:
                result.setText(result.getText() + "*");
                Calculation.push("*");
                break;
            case R.id.divided_btu:
                result.setText(result.getText() + "/");
                Calculation.push("/");
                break;
            case R.id.clear_btu:
//                String s=result.getText().toString();
//                s = s.substring(0,s.length()-1);
//                result.setText(s);
                Calculation.clearArray();
                result.setText("");
                break;
            case R.id.equal_btu:
                // result.setText(result.getText() + "=");
                float value=Calculation.CalculatetheValue();
                Calculation.clearArray();
                result.setText(value+"");
                Log.e(TAG,"Total calculation is="+value);
                break;
        }
    }

    private void setViewmethod() {
        one_btu = (Button) findViewById(R.id.one_btu) ;
        two_btu = (Button) findViewById(R.id.two_btu);
        three_btu = (Button) findViewById(R.id.three_btu);
        four_btu = (Button) findViewById(R.id.four_btu);
        five_btu = (Button) findViewById(R.id.five_btu);
        six_btu = (Button) findViewById(R.id.six_btu);
        seven_btu = (Button) findViewById(R.id.seven_btu);
        eight_btu = (Button)  findViewById(R.id.eight_btu);
        nine_btu = (Button) findViewById(R.id.nine_btu);
        zero_btu = (Button) findViewById(R.id.zero_btu);

        clear_btu = (Button) findViewById(R.id.clear_btu);

        equal_btu = (Button) findViewById(R.id.equal_btu);

        plus_btu = (Button) findViewById(R.id.plus_btu);
        minus_btu = (Button) findViewById(R.id.minus_btu);
        divided_btu = (Button) findViewById(R.id.divided_btu);
        time_btu = (Button) findViewById(R.id.time_btu);

        result = (TextView) findViewById(R.id.result);
        advance_title = (TextView) findViewById(R.id.advance_title);
    }
}