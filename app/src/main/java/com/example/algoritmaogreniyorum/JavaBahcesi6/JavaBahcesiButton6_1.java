package com.example.algoritmaogreniyorum.JavaBahcesi6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton6_1 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button6_1);
        tvCevap = findViewById(R.id.tvCevap6_1);
        btnDevam = findViewById(R.id.btnDevam6_1);
        btnDevam.setVisibility(View.INVISIBLE);

    }

    public void calistir6_1(View view) {
        btnDevam.setVisibility(View.VISIBLE);
        tvCevap.setText("2");
    }

    public void devam6_1(View view) {
        Intent intet = new Intent(getApplicationContext(), JavaBahcesiButton6_2.class);
        startActivity(intet);
    }
}
