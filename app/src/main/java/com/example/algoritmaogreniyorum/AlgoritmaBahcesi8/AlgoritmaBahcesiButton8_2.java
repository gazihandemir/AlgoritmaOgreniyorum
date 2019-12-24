package com.example.algoritmaogreniyorum.AlgoritmaBahcesi8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton8_2 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button8_2);
        btnDevam = findViewById(R.id.btnDevamAlgo8_2);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo8_2);
        tvCevap.setVisibility(View.INVISIBLE);

    }

    public void calistirAlgo8_2(View view) {
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("1");
        btnDevam.setVisibility(View.VISIBLE);

    }

    public void devamAlgo8_2(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton8_3.class);
        startActivity(intent);
    }
}

