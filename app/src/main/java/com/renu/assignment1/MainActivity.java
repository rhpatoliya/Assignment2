package com.renu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result , advance_title;

    Button one_btu , two_btu , three_btu , four_btu , five_btu , six_btu, seven_btu ,
            eight_btu , nine_btu , zero_btu;

    Button clear_btu;

    Button equal_btu , plus_btu , minus_btu , time_btu , divided_btu;

    float mValueOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        one_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });
        two_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });
        three_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });
        four_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });
        five_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });
        six_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });
        seven_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });
        eight_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });
        nine_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });
        zero_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "0");
            }
        });

        plus_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "+");

                }

        });
        minus_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "-");

            }

        });
        time_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "*");

            }

        });

        divided_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "/");

            }

        });

        equal_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "=");

            }

        });

        clear_btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=result.getText().toString();
                s = s.substring(0,s.length()-1); 
                result.setText(s);
            }
        });




    }
}