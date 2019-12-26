package com.example.algoritmaogreniyorum.AlgoritmaBahcesi9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton9_3 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button9_3);
        btnDevam = findViewById(R.id.btnDevamAlgo9_3);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo9_3);
        tvCevap.setVisibility(View.INVISIBLE);
    }

    public void calistirAlgo9_3(View view) {
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("Fonksiyon çalışmaz....");
        btnDevam.setVisibility(View.VISIBLE);

    }

    public void devamAlgo9_3(View view) {
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton9_4.class);
        startActivity(intent);

    }


}
