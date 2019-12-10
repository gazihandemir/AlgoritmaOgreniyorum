package com.example.algoritmaogreniyorum.AlgoritmaBahcesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton2_1 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button2_1);
        tvCevap = findViewById(R.id.tvCevapAlgo2_1);
        tvCevap.setVisibility(View.INVISIBLE);
        btnDevam = findViewById(R.id.btnDevamAlgo2_1);
        btnDevam.setVisibility(View.INVISIBLE);
    }
    public void calistirAlgo2_1(View view){
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("algoritma ögreniyorum");
        btnDevam.setVisibility(View.VISIBLE);
    }
    public void devamAlgo2_1(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton2_2.class);
        startActivity(intent);
    }
}
