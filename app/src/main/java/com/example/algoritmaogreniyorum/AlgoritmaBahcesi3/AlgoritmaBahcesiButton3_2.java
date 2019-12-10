package com.example.algoritmaogreniyorum.AlgoritmaBahcesi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton3_2 extends AppCompatActivity {
        TextView tvCevap;
        Button btnDevam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button3_2);
        tvCevap = findViewById(R.id.tvCevapAlgo3_2);
        tvCevap.setVisibility(View.INVISIBLE);
        btnDevam = findViewById(R.id.btnDevamAlgo3_3);
        btnDevam.setVisibility(View.INVISIBLE);

    }
    public void  calistirAlgo3_2(View view) {
        tvCevap.setText("Efsane Ahmet");
        tvCevap.setVisibility(View.VISIBLE);
        btnDevam.setVisibility(View.VISIBLE);
    }
    public void devamAlgo3_2(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton3_3.class);
        startActivity(intent);
    }
}
