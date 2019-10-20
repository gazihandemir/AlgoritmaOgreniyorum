package com.example.algoritmaogreniyorum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.algoritmaogreniyorum.JavaBahcesi1.JavaBahcesiButton1_1;
import com.example.algoritmaogreniyorum.JavaBahcesi2.JavaBahcesiButton2_1;
import com.example.algoritmaogreniyorum.JavaBahcesi3.JavaBahcesiButton3_1;

public class JavaBahcesiActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    int[] görünmezlik = new int[10];
    static int buton2;
    static int buton3;
    static int buton4;
    static int buton5;
    static int buton6;
    static int buton7;
    static int buton8;
    static int buton9;
    static int buton10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_java_bahcesi);
        btn1 = findViewById(R.id.btnJavaBahce1);
        btn2 = findViewById(R.id.btnJavaBahce2);
        btn3 = findViewById(R.id.btnJavaBahce3);
        btn4 = findViewById(R.id.btnJavaBahce4);
        btn5 = findViewById(R.id.btnJavaBahce5);
        btn6 = findViewById(R.id.btnJavaBahce6);
        btn7 = findViewById(R.id.btnJavaBahce7);
        btn8 = findViewById(R.id.btnJavaBahce8);
        btn9 = findViewById(R.id.btnJavaBahce9);
        btn10 = findViewById(R.id.btnJavaBahce10);

/*
        if (buton2 == 1) {
            btn2.setVisibility(View.VISIBLE);
        } else {
            btn2.setVisibility(View.INVISIBLE);
        }
        if (buton3 == 1) {
            btn3.setVisibility(View.VISIBLE);
        } else {
            btn3.setVisibility(View.INVISIBLE);
        }
        if (buton4 == 1) {
            btn4.setVisibility(View.VISIBLE);
        } else {
            btn4.setVisibility(View.INVISIBLE);
        }
        if (buton5 == 1) {
            btn5.setVisibility(View.VISIBLE);
        }else{
            btn5.setVisibility(View.INVISIBLE);
        }
        if (buton6 == 1) {
            btn6.setVisibility(View.VISIBLE);
        }else{
            btn6.setVisibility(View.INVISIBLE);
        }
        if (buton7 == 1) {
            btn7.setVisibility(View.VISIBLE);
        }else{
            btn7.setVisibility(View.INVISIBLE);
        }
        if (buton8 == 1) {
            btn8.setVisibility(View.VISIBLE);
        }else{
            btn8.setVisibility(View.INVISIBLE);
        }
        if (buton9 == 1) {
            btn9.setVisibility(View.VISIBLE);
        }else{
            btn9.setVisibility(View.INVISIBLE);
        }
        if (buton10 == 1) {
            btn10.setVisibility(View.VISIBLE);
        }else{
            btn10.setVisibility(View.INVISIBLE);
        }*/


    }

    public void btnBahce1click(View view) {

        Intent intent = new Intent(getApplicationContext(), JavaBahcesiButton1_1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        buton2 = 1;
    }

    public void btnBahce2click(View view) {
        Intent intent = new Intent(getApplicationContext(), JavaBahcesiButton2_1.class);
        startActivity(intent);
        btn3.setVisibility(View.VISIBLE);
        buton3 = 1;
    }
    public void btnBahce3click(View view){
        Intent intent = new Intent(getApplicationContext(), JavaBahcesiButton3_1.class);
        startActivity(intent);
        buton4 = 1;
    }/*
    public void btnBahce4click(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton4_1.class);
        startActivity(intent);
        buton5 = 1;
    }
    public void btnBahce5click(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton5_1.class);
        startActivity(intent);
        buton6 = 1;
    }
    public void btnBahce6click(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton6_1.class);
        startActivity(intent);
        buton7 = 1;
    }
    public void btnBahce7click(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton7_1.class);
        startActivity(intent);
        buton8 = 1;
    }
    public void btnBahce8click(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton8_1.class);
        startActivity(intent);
        buton9 = 1;
    }
    public void btnBahce9click(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton9_1.class);
        startActivity(intent);
        buton10 = 1;
    }public void btnBahce10click(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton10_1.class);
        startActivity(intent);
    }*/

}
