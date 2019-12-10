package com.example.algoritmaogreniyorum.AlgoritmaBahcesi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton3_1 extends AppCompatActivity {
    TextView tvSonuc;
    Button btnDevam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button3_1);
        tvSonuc = findViewById(R.id.tvCevapAlgo3_1);
        tvSonuc.setVisibility(View.INVISIBLE);
        btnDevam = findViewById(R.id.btnDevamAlgo3_1);
        btnDevam.setVisibility(View.INVISIBLE);

    }

    public void calistirAlgo3_1(View view){
        tvSonuc.setText("Ahmet");
        tvSonuc.setVisibility(View.VISIBLE);
        btnDevam.setVisibility(View.VISIBLE);
    }
    public void devamAlgo3_1(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton3_2.class);
        startActivity(intent);
    }
}
