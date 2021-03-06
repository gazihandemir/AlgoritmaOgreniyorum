package com.example.algoritmaogreniyorum.AlgoritmaBahcesi4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton4_2 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button4_2);
        btnDevam = findViewById(R.id.btnDevamAlgo4_2);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo4_2);
        tvCevap.setVisibility(View.INVISIBLE);
    }
    public void calistirAlgo4_2(View view) {
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("3 sayıdir ");
        btnDevam.setVisibility(View.VISIBLE);
    }
    public void devamAlgo4_2(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton4_3.class);
        startActivity(intent);
    }
}
