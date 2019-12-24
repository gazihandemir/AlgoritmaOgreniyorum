package com.example.algoritmaogreniyorum.AlgoritmaBahcesi8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton8_3 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button8_3);
        btnDevam =  findViewById(R.id.btnDevamAlgo8_3);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap  = findViewById(R.id.tvCevapAlgo8_3);
        tvCevap.setVisibility(View.INVISIBLE);

    }
    public void calistirAlgo8_3(View view){
            tvCevap.setVisibility(View.VISIBLE);
            tvCevap.setText("0");
            btnDevam.setVisibility(View.VISIBLE);
    }
    public void devamAlgo8_3(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton8_4.class);
        startActivity(intent);
    }
}
