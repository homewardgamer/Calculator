package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    TextView a;
    double num,no=0;
    boolean ad,mi,mul,di,mo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(TextView) findViewById(R.id.textView);
        a.setText("00");
        ad=false;
        mi=false;
        mul=false;
        di=false;
        mo=false;
        FloatingActionButton one= (FloatingActionButton) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.getText()!="00") {
                    a.setText(a.getText() + "1");
                    no=no*10+1;
                }
                else {
                    a.setText("1");
                }
            }
        });
        FloatingActionButton two= (FloatingActionButton) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()!="00") {
                    a.setText(a.getText() + "2");
                    no=no*10+2;
                }
                else
                    a.setText("2");
            }
        });
        FloatingActionButton three= (FloatingActionButton) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()!="00") {
                    a.setText(a.getText() + "3");
                    no=no*10+3;
                }
                else
                    a.setText("3");
            }
        });
        FloatingActionButton four= (FloatingActionButton) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()!="00") {
                    a.setText(a.getText() + "4");
                    no=no*10+4;
                }
                else
                    a.setText("4");
            }
        });
        FloatingActionButton five= (FloatingActionButton) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()!="00") {
                    a.setText(a.getText() + "5");
                    no=no*10+5;
                }
                else
                    a.setText("5");
            }
        });
        FloatingActionButton six= (FloatingActionButton) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()!="00") {
                    a.setText(a.getText() + "6");
                    no=no*10+6;
                }
                else
                    a.setText("6");
            }
        });
        FloatingActionButton seven= (FloatingActionButton) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()!="00") {
                    a.setText(a.getText() + "7");
                    no=no*10+7;
                }
                else
                    a.setText("7");
            }
        });
        FloatingActionButton eight= (FloatingActionButton) findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()!="00") {
                    a.setText(a.getText() + "8");
                    no=no*10+8;
                }
                else
                    a.setText("8");
            }
        });
        FloatingActionButton nine= (FloatingActionButton) findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()!="00") {
                    a.setText(a.getText() + "9");
                    no=no*10+9;
                }
                else
                    a.setText("9");
            }
        });
        FloatingActionButton plus =(FloatingActionButton) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()=="00")
                    a.setText("00");
                else
                {
                    num=Double.parseDouble(a.getText().toString());
                    a.setText(a.getText()+"+");
                    no=0;
                    ad=true;


                }
            }
        });
        FloatingActionButton minus =(FloatingActionButton) findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()=="00")
                    a.setText("00");
                else
                {
                    num=Double.parseDouble(a.getText().toString());
                    a.setText(a.getText()+"-");
                    no=0;
                    mi=true;



                }
            }
        });
        FloatingActionButton mult =(FloatingActionButton) findViewById(R.id.mult);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()=="00")
                    a.setText("00");
                else
                {
                    num=Double.parseDouble(a.getText().toString());
                    a.setText(a.getText()+"*");
                    mul=true;
                    no=0;



                }
            }
        });
        FloatingActionButton div =(FloatingActionButton) findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()=="00")
                    a.setText("00");
                else
                {
                    num=Double.parseDouble(a.getText().toString());
                    a.setText(a.getText()+"÷");
                    di=true;
                    no=0;



                }
            }
        });
        FloatingActionButton mod =(FloatingActionButton) findViewById(R.id.mod);
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()=="00")
                    a.setText("00");
                else
                {
                    num=Integer.parseInt(a.getText().toString());
                    a.setText(a.getText()+"%");
                    mo=true;
                    no=0;



                }
            }
        });
        FloatingActionButton clear =(FloatingActionButton) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setText("00");
                num=0;
                no=0;
                ad=mi=di=mul=mo=false;
            }
        });
        FloatingActionButton dot =(FloatingActionButton) findViewById(R.id.dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a.getText()=="00")
                    a.setText("00");
                else
                {
                    a.setText(a.getText()+".");
                    no=no/10;
                }
            }
        });
        ImageButton equals =(ImageButton) findViewById(R.id.equal);
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ad)
                {
                    a.setText(Double.toString(no+num));
                    num=no+num;
                    no=0;
                    ad=false;
                }
                else if(mi)
                {
                    a.setText(Double.toString(num-no));
                    mi=false;
                    num=num-no;
                    no=0;
                }
                else if(mul)
                {
                    a.setText(Double.toString(no*num));
                    mul=false;
                    num=no*num;
                    no=0;
                }
                else if(di)
                {
                    a.setText(Double.toString(num/no));
                    di=false;
                    num=num/no;
                    no=0;

                }
                else if(mo)
                {
                    a.setText(Double.toString(num%no));
                    mo=false;
                    num=num%no;
                    no=0;
                }
            }
        });



    }
}