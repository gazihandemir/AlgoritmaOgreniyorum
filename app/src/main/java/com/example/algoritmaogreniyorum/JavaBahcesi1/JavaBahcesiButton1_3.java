package com.example.algoritmaogreniyorum.JavaBahcesi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton1_3 extends AppCompatActivity {
    TextView tvCalistir;
    Button btnDevam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button1_3);
        tvCalistir = findViewById(R.id.tvCalistir);
        btnDevam = findViewById(R.id.btnDevam1_3);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCalistir.setVisibility(View.INVISIBLE);
    }
    public void calistir(View view){
        tvCalistir.setText("Hello World");
        btnDevam.setVisibility(View.VISIBLE);
        tvCalistir.setVisibility(View.VISIBLE);
    }
    public void devam1_3(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton1_4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
