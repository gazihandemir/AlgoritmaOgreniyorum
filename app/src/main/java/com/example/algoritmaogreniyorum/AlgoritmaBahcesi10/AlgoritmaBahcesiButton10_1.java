package com.example.algoritmaogreniyorum.AlgoritmaBahcesi10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton10_1 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button10_1);
        btnDevam = findViewById(R.id.btnDevamAlgo10_1);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo10_1);
        tvCevap.setVisibility(View.VISIBLE);


    }

    public void calistirAlgo10_1(View view) {
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("Ahmet");
        btnDevam.setVisibility(View.VISIBLE);
    }

    public void devamAlgo10_1(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton10_2.class);
        startActivity(intent);

    }
}
