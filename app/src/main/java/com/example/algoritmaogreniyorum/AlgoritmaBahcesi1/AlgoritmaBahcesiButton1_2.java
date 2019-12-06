package com.example.algoritmaogreniyorum.AlgoritmaBahcesi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton1_2 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button1_2);
        btnDevam = findViewById(R.id.btnDevamAlgo1_2);
        tvCevap = findViewById(R.id.tvCevapAlgo1_2);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap.setVisibility(View.INVISIBLE);
    }

    public void btnCalistirAlgoClick1_2(View view){
        tvCevap.setVisibility(View.VISIBLE);
        tvCevap.setText("Goster();");
        btnDevam.setVisibility(View.VISIBLE);
    }
    public void btnDevamAlgoClick1_2(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton1_3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);

    }
}
