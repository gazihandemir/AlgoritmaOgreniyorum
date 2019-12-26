package com.example.algoritmaogreniyorum.AlgoritmaBahcesi10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton10_4 extends AppCompatActivity {
        Button btnDevam;
        TextView tvCevap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button10_4);
        btnDevam = findViewById(R.id.btnDevamAlgo10_4);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo10_4);
        tvCevap.setVisibility(View.INVISIBLE);

    }
    public  void calistirAlgo10_4(View view){
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("4. eleman olmadığı için hata !");
        btnDevam.setVisibility(View.VISIBLE);
    }
    public void devamAlgo10_4(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton10_5.class);
        startActivity(intent);
    }
}
