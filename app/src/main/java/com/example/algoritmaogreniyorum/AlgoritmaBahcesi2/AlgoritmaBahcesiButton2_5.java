package com.example.algoritmaogreniyorum.AlgoritmaBahcesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton2_5 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button2_5);
        tvCevap = findViewById(R.id.tvCevapAlgo2_5);
        tvCevap.setVisibility(View.INVISIBLE);
        btnDevam = findViewById(R.id.btnDevamAlgo2_5);
        btnDevam.setVisibility(View.INVISIBLE);

    }
    public void calistirAlgo2_5(View view){
            tvCevap.setVisibility(View.VISIBLE);
            tvCevap.setText("4");
            btnDevam.setVisibility(View.VISIBLE);
    }
    public void devamAlgo2_5(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton2_6.class);
        startActivity(intent);
    }
}
