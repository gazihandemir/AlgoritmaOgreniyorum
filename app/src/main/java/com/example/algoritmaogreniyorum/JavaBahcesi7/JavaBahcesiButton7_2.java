package com.example.algoritmaogreniyorum.JavaBahcesi7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton7_2 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button7_2);

        btnDevam = findViewById(R.id.btnDevam7_2);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevap7_2);
        tvCevap.setVisibility(View.INVISIBLE);
    }

    public void calistir7_2(View view){
            tvCevap.setVisibility(View.VISIBLE);
            tvCevap.setText("10");
            btnDevam.setVisibility(View.VISIBLE);
    }
    public void devam7_2(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton7_3.class);
        startActivity(intent);
    }
}
