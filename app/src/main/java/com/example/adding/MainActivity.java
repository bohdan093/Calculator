package com.example.adding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button one, two, three, four, five, six, seven, eight, nine, plus, minus, multiply, zero, doubleZero, remove, cR, equals, point, ost, divide;
private TextView text;
private String ex="", num="";
private int result =0, number =0;
private ArrayList<String> chain = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        doubleZero = findViewById(R.id.doubleZero);
        remove = findViewById(R.id.remove);
        cR = findViewById(R.id.cR);
        equals = findViewById(R.id.equals);
        point = findViewById(R.id.point);
        text = findViewById(R.id.field);
        zero = findViewById(R.id.zero);
        ost = findViewById(R.id.chastka);
        divide = findViewById(R.id.divide);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        doubleZero.setOnClickListener(this);
        remove.setOnClickListener(this);
        cR.setOnClickListener(this);
        equals.setOnClickListener(this);
        point.setOnClickListener(this);
        text.setOnClickListener(this);
        zero.setOnClickListener(this);
        divide.setOnClickListener(this);
        ost.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.one:{
                num +="1";
                ex+="1";
                text.setText(ex);
                break;
            }

            case R.id.two:{
                num +="2";
                ex+="2";
                text.setText(ex);
                break;
            }
            case R.id.three:{
                num +="3";
                ex+="3";
                text.setText(ex);
                break;
            }
            case R.id.four:{
                num +="4";
                ex+="4";
                text.setText(ex);
                break;
            }
            case R.id.five:{
                num +="5";
                ex+="5";
                text.setText(ex);
                break;
            }
            case R.id.six:{
                num +="6";
                ex+="6";
                text.setText(ex);
                break;
            }
            case R.id.seven:{
                num +="7";
                ex+="7";
                text.setText(ex);
                break;
            }
            case R.id.eight:{
                num +="8";
                ex+="8";
                text.setText(ex);
                break;
            }
            case R.id.nine:{
                num +="9";
                ex+="9";
                text.setText(ex);
                break;
            }
            case R.id.zero:{
                num +="0";
                ex+="0";
                text.setText(ex);
                break;
            }
            case R.id.doubleZero:{
                num +="00";
                ex+="00";
                text.setText(ex);
                break;
            }
            case R.id.point:{
                num +=".";
                ex+=".";
                text.setText(ex);
                break;
            }
            case R.id.cR:{
                ex="";
                text.setText(ex);
                result =0;
                chain.removeAll(chain);
                num="";
                break;
            }
            case R.id.remove:{
                if(ex.length()!=0) {
                    ex = ex.substring(0, ex.length() - 1);
                    num = num.substring(0, num.length() - 1);
                    text.setText(ex);
                }
                break;
            }
            case R.id.plus:{
                chain.add(num);
                num="";
                chain.add("+");
                ex+="+";
                text.setText(ex);

                break;
            }
            case R.id.multiply:{
                chain.add(num);
                num="";
                chain.add("X");
                ex+="X";
                text.setText(ex);

                break;
            }

            case R.id.minus:{
                chain.add(num);
                num="";
                chain.add("-");
                ex+="-";
                text.setText(ex);
                break;
            }
            case R.id.equals:{
                chain.add(num);
                operation(chain);
                text.setText(String.valueOf(result));
                result =0;
                chain.removeAll(chain);

                break;
            }
            case R.id.divide:{
                chain.add(num);
                num="";
                chain.add("/");
                ex+="/";
                text.setText(ex);
                break;
            }
            case R.id.chastka:{
                chain.add(num);
                num="";
                chain.add("%");
                ex+="%";
                text.setText(ex);
                break;
            }

        }
    }

    public void operation( ArrayList<String> list){
        if(result == 0) {
            result = Integer.parseInt(list.get(0));
        }

       for(int i=1; i<list.size(); i+=2){
           switch(list.get(i)){
               case "+":{
                   result+=Integer.parseInt(list.get(i+1));

                   break;
               }

               case "-":{
                   result-=Integer.parseInt(list.get(i+1));
                   break;
               }

               case "X":{
                   result*=Integer.parseInt(list.get(i+1));
                break;
            }

            case "/":{
                result/=Integer.parseInt(list.get(i+1));

                break;
            }

            case "%":{
                result/=10;
                break;
            }
           }
       }
//        switch(sign){
//            case "+":{
//                result+=number;
//
//                break;
//            }
//
//            case "-":{
//                result+=number;
//                break;
//            }
//
//            case "X":{
//
//                break;
//            }
//
//            case "/":{
//
//                break;
//            }
//
//            case "%":{
//
//                break;
//            }
//
//
//        }
    }

}