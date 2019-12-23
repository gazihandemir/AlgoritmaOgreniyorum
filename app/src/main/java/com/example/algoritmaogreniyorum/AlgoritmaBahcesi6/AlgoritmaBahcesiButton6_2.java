package com.example.algoritmaogreniyorum.AlgoritmaBahcesi6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.AlgoritmaBahcesi5.AlgoritmaBahcesiButton5_1;
import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton6_2 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button6_2);
        btnDevam = findViewById(R.id.btnDevamAlgo6_2);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevapAlgo6_2);
        tvCevap.setVisibility(View.INVISIBLE);

    }

    public void calistirAlgo6_2(View view){
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("30");
        btnDevam.setVisibility(View.VISIBLE);
    }
    public void  devamAlgo6_2(View view){
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton6_3.class);
        startActivity(intent);
    }
}
