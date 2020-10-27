package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
//    private Button sub;
//    private Button mul;
//    private Button div;
//    private Button dec;
    private TextView info;
    private TextView result;
    private String str;
    private int ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        add.setOnClickListener(this);
        result.setOnClickListener(this);


    }


    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.zero:
//                Toast.makeText(this,"Button zero", Toast.LENGTH_SHORT).show();
                str = str.concat("0");
                info.append("0");
                break;
            case R.id.one:
                str = str.concat("1");
                info.append("1");
                break;
            case R.id.two:
                str = str.concat("2");
                info.append("2");
                break;
            case R.id.three:
                str = str.concat("3");
                info.append("3");
                break;
            case R.id.four:
                str = str.concat("4");
                info.append("4");
                break;
            case R.id.five:
                str = str.concat("5");
                info.append("5");
                break;
            case R.id.six:
                str = str.concat("6");
                info.append("6");
                break;
            case R.id.seven:
                str = str.concat("7");
                info.append("7");
                break;
            case R.id.eight:
                str = str.concat("8");
                info.append("8");
                break;
            case R.id.nine:
                str = str.concat("9");
                info.append("9");
                break;
            case R.id.add:

                ans = ans + Integer.parseInt(str);
                Log.d("check",Integer.toString(ans));
                result.setText(Integer.toString(ans));
                info.setText("");
                str = "";
                break;
        }
    }

    private void setup(){
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        zero = (Button)findViewById(R.id.zero);
        add = (Button)findViewById(R.id.add);
//        sub = (Button)findViewById(R.id.subtract);
//        div = (Button)findViewById(R.id.divide);
//        mul = (Button)findViewById(R.id.multiply);
//        dec = (Button)findViewById(R.id.decimal);
        info = (TextView) findViewById(R.id.cal);
        result = (TextView) findViewById(R.id.result);
        str = "";
        ans = 0;

    }

}