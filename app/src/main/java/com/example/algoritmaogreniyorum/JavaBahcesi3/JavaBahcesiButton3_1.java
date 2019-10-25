package com.example.algoritmaogreniyorum.JavaBahcesi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.JavaBahcesiActivity;
import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton3_1 extends AppCompatActivity {

    TextView tvCevap;
    Button btnDevam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button3_1);
        tvCevap = findViewById(R.id.tvCevap3_1);
        btnDevam = findViewById(R.id.btnDevam3_1);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap.setVisibility(View.INVISIBLE);

    }
    public void calistir3_1(View view){
        btnDevam.setVisibility(View.VISIBLE);
        tvCevap.setText("0.50");
        tvCevap.setVisibility(View.VISIBLE);

    }
    public void devam3_1(View view){
        Intent intent = new Intent(getApplicationContext(), JavaBahcesiButton3_2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

}
