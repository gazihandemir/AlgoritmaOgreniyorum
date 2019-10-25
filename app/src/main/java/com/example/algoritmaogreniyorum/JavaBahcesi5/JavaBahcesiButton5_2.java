package com.example.algoritmaogreniyorum.JavaBahcesi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton5_2 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button5_2);

        tvCevap = findViewById(R.id.tvCevap5_2);
        btnDevam = findViewById(R.id.btnDevam5_2);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap.setVisibility(View.INVISIBLE);
    }
    public void calistir5_2(View view) {
        tvCevap.setText("HATA ! ");
       btnDevam.setVisibility(View.VISIBLE);
       tvCevap.setVisibility(View.VISIBLE);

    }
    public void devam5_2(View view) {
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton5_3.class);
        startActivity(intent);
    }
}
