package com.example.algoritmaogreniyorum.AlgoritmaBahcesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.algoritmaogreniyorum.AlgoritmaBahcesi1.AlgoritmaBahcesiButton1_1;
import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton2_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button2_4);
    }

    public void devamAlgo2_4(View view){
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton2_5.class);
        startActivity(intent);
    }
}
