package com.example.algoritmaogreniyorum.AlgoritmaBahcesi9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton9_1 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button9_1);
        btnDevam = findViewById(R.id.btnDevamAlgo9_1);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo9_1);
        tvCevap.setVisibility(View.INVISIBLE);
    }

    public void calistirAlgo9_1(View view) {
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("sut basarili");
        btnDevam.setVisibility(View.VISIBLE);
    }

    public void devamAlgo9_1(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton9_2.class);
        startActivity(intent);

    }
}
