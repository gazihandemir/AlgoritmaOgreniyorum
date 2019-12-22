package com.example.algoritmaogreniyorum.AlgoritmaBahcesi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton5_6 extends AppCompatActivity {
        Button btnDevam;
        TextView tvCevap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button5_6);
        btnDevam = findViewById(R.id.btnDevamAlgo5_6);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo5_6);
        tvCevap.setVisibility(View.INVISIBLE);

    }
    public void calistirAlgo5_6(View view){
            tvCevap.setVisibility(View.VISIBLE);
            tvCevap.setText("6");
            btnDevam.setVisibility(View.VISIBLE);
    }
    public void devamAlgo5_6(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton5_7.class);
        startActivity(intent);
    }
}
