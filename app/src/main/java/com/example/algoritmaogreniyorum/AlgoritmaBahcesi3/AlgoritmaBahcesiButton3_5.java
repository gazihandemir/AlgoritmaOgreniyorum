package com.example.algoritmaogreniyorum.AlgoritmaBahcesi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton3_5 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button3_5);
        btnDevam = findViewById(R.id.btnDevamAlgo3_5);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo3_5);
        tvCevap.setVisibility(View.INVISIBLE);

    }

    public void calistirAlgo3_5(View view) {
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("Levent");
        btnDevam.setVisibility(View.VISIBLE);
    }

    public void devamAlgo3_5(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton3_6.class);
        startActivity(intent);
    }

}
