package com.example.algoritmaogreniyorum.AlgoritmaBahcesi7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton7_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button7_1);
    }

    public void devamAlgo7_1(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton7_2.class);
        startActivity(intent);
    }
}
