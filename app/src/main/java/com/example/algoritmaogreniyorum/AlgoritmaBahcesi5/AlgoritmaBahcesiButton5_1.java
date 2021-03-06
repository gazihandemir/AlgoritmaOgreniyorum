package com.example.algoritmaogreniyorum.AlgoritmaBahcesi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton5_1 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button5_1);
        btnDevam = findViewById(R.id.btnDevamAlgo5_1);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo5_1);
        tvCevap.setVisibility(View.INVISIBLE);

    }

    public void calistirAlgo5_1(View view) {
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText(" 9 ");
        btnDevam.setVisibility(View.VISIBLE);
    }

    public void devamAlgo5_1(View view) {
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton5_2.class);
        startActivity(intent);
    }
}
