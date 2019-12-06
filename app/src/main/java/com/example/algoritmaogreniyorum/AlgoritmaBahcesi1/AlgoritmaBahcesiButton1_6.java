package com.example.algoritmaogreniyorum.AlgoritmaBahcesi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton1_6 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button1_6);
        tvCevap  = findViewById(R.id.tvCevapAlgo1_6);
        btnDevam = findViewById(R.id.btnDevamAlgo1_6);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap.setVisibility(View.INVISIBLE);

    }


    public void calistirAlgo1_6(View view){
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("efsane");
        btnDevam.setVisibility(View.VISIBLE);

    }
    public void devamAlgo1_6(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton1_7.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
