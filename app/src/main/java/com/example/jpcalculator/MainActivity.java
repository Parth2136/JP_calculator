package com.mastersmiple.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jpcalculator.R;

public class MainActivity extends AppCompatActivity

{

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,equal,point,sub,multi,div,per,delete,ac,plus;
    TextView txt;
    int f_num;
    int s_num;
    char op='+';

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        txt=findViewById(R.id.txt);
        equal=findViewById(R.id.equal);
        plus=findViewById(R.id.plus);
        point=findViewById(R.id.point);
        sub=findViewById(R.id.sub);
        multi=findViewById(R.id.multi);
        div=findViewById(R.id.div);
        per=findViewById(R.id.per);
        delete=findViewById(R.id.delete);
        ac=findViewById(R.id.ac);

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f_num= Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='-';
                f_num=Integer.parseInt(txt.getText().toString());
                txt.setText("");

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='*';
                f_num= Integer.parseInt(txt.getText().toString());
                txt.setText("");

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='/';
                f_num= Integer.parseInt(txt.getText().toString());
                txt.setText("");

            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='%';
                f_num= Integer.parseInt(txt.getText().toString());

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                op='X';
                f_num= Integer.parseInt(txt.getText().toString());
                txt.setText("");

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='.';
                f_num= Integer.parseInt(txt.getText().toString());
                txt.setText("");

            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f_num=0;
                s_num=0;
                txt.setText("");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s_num= Integer.parseInt(txt.getText().toString());
                if(op=='+'){
                    txt.setText(""+(f_num+s_num));
                } if(op=='-'){
                    txt.setText(""+(f_num-s_num));
                }if(op=='*'){
                    txt.setText(""+(f_num*s_num));
                }if(op=='/'){
                    txt.setText(""+(f_num/s_num));
                }if(op=='%'){
                    txt.setText(""+((f_num*s_num)/100));
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op ='+';
                f_num= Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old =txt.getText().toString();
                txt.setText(old+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old =txt.getText().toString();
                txt.setText(old+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old =txt.getText().toString();
                txt.setText(old+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old =txt.getText().toString();
                txt.setText(old+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old =txt.getText().toString();
                txt.setText(old+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old =txt.getText().toString();
                txt.setText(old+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old =txt.getText().toString();
                txt.setText(old+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old =txt.getText().toString();
                txt.setText(old+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old =txt.getText().toString();
                txt.setText(old+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old =txt.getText().toString();
                txt.setText(old+"0");
            }
        });

    }
}