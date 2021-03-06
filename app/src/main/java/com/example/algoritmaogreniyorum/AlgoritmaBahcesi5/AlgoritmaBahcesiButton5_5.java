package com.example.algoritmaogreniyorum.AlgoritmaBahcesi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton5_5 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button5_5);
        btnDevam = findViewById(R.id.btnDevamAlgo5_5);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo5_5);
        tvCevap.setVisibility(View.INVISIBLE);

    }

    public void calistirAlgo5_5(View view) {
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("20");
        btnDevam.setVisibility(View.VISIBLE);
    }

    public void devamAlgo5_5(View view) {
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton5_6.class);
        startActivity(intent);
    }
}
