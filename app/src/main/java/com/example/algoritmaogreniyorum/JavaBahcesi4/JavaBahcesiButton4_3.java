package com.example.algoritmaogreniyorum.JavaBahcesi4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.JavaBahcesi3.JavaBahcesiButton3_2;
import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton4_3 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button4_3);
        tvCevap = findViewById(R.id.tvCevap4_3);
        btnDevam = findViewById(R.id.btnDevam4_3);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap.setVisibility(View.INVISIBLE);
    }

    public void calistir4_3(View view) {
        tvCevap.setText("1");
        btnDevam.setVisibility(View.VISIBLE);
        tvCevap.setVisibility(View.VISIBLE);
    }

    public void devam4_3(View view) {
        Intent intent = new Intent(getApplicationContext(), JavaBahcesiButton4_4.class);
        startActivity(intent);
    }

}
