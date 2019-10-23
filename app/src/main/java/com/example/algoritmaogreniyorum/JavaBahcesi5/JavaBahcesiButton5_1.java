package com.example.algoritmaogreniyorum.JavaBahcesi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton5_1 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button5_1);
        tvCevap = findViewById(R.id.tvCevap5_1);
        btnDevam = findViewById(R.id.btnDevam5_1);
        btnDevam.setVisibility(View.INVISIBLE);

    }
    public void calistir5_1(View view){
        tvCevap.setText("Efsanegeliyor");
        btnDevam.setVisibility(View.VISIBLE);
    }public void devam5_1(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton5_2.class);
        startActivity(intent);
    }

}
