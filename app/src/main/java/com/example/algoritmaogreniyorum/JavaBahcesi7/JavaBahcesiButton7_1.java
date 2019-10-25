package com.example.algoritmaogreniyorum.JavaBahcesi7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton7_1 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button7_1);

        btnDevam = findViewById(R.id.btnDevam7_1);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevap7_1);
        tvCevap.setVisibility(View.INVISIBLE);
    }

    public void calistir7_1(View view) {
        tvCevap.setText("10");
        tvCevap.setVisibility(View.VISIBLE);
        btnDevam.setVisibility(View.VISIBLE);
    }

    public void devam7_1(View view) {
        Intent intent = new Intent(getApplicationContext(), JavaBahcesiButton7_2.class);
        startActivity(intent);
    }
}
