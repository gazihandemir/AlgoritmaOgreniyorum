package com.example.algoritmaogreniyorum.JavaBahcesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;
public class JavaBahcesiButton2_3 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap1;
    TextView tvCevap2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button2_3);
        btnDevam = findViewById(R.id.btnDevam2_3);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap1 = findViewById(R.id.tvCevap2_3_1);
        tvCevap2 = findViewById(R.id.tvCevap2_3_2);
    }
    public void calistir2_3(View view){
        btnDevam.setVisibility(View.VISIBLE);
        tvCevap1.setText("21");
        tvCevap2.setText("5.0");
    }public void devam2_3(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton2_4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
