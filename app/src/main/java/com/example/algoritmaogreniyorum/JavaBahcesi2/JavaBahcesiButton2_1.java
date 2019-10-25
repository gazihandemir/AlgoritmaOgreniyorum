package com.example.algoritmaogreniyorum.JavaBahcesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton2_1 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button2_1);
        btnDevam = findViewById(R.id.btnDevam2_1);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevap2_1);
        tvCevap.setVisibility(View.INVISIBLE);

    }

    public void calistir2_1(View view) {
        tvCevap.setText("4");
        btnDevam.setVisibility(View.VISIBLE);
        tvCevap.setVisibility(View.VISIBLE);

    }

    public void devam2_1(View view) {
        Intent intent = new Intent(getApplicationContext(), JavaBahcesiButton2_2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
