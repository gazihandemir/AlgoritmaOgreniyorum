package com.example.algoritmaogreniyorum.AlgoritmaBahcesi6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.AlgoritmaBahcesi5.AlgoritmaBahcesiButton5_1;
import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton6_1 extends AppCompatActivity {
        Button btnDevam;
        TextView tvCevap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button6_1);
        btnDevam = findViewById(R.id.btnDevamAlgo6_1);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo6_1);
        tvCevap.setVisibility(View.INVISIBLE);

    }
    public void calistirAlgo6_1(View view) {
            tvCevap.setVisibility(View.VISIBLE);
            tvCevap.setText("4");
            btnDevam.setVisibility(View.VISIBLE);
    }
    public void devamAlgo6_1(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton6_2.class);
        startActivity(intent);
    }
}
