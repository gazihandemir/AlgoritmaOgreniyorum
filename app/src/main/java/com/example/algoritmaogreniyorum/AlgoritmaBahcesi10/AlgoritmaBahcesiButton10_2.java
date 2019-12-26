package com.example.algoritmaogreniyorum.AlgoritmaBahcesi10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton10_2 extends AppCompatActivity {
        Button btnDevam;
        TextView tvCevap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button10_2);
    btnDevam = findViewById(R.id.btnDevamAlgo10_2);
    btnDevam.setVisibility(View.INVISIBLE);
    tvCevap = findViewById(R.id.tvCevapAlgo10_2);
    tvCevap.setVisibility(View.INVISIBLE);



    }
    public void calistirAlgo10_2(View view) {
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("[Gazi,İzel,Ahmet]");
        btnDevam.setVisibility(View.VISIBLE);
    }

    public void devamAlgo10_2(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton10_3.class);
        startActivity(intent);
    }
}
