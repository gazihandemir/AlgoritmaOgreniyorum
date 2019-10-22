package com.example.algoritmaogreniyorum.JavaBahcesi4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton4_2 extends AppCompatActivity {
    TextView tvCevap;
    Button btnDevam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button4_2);
        tvCevap = findViewById(R.id.tvCevap4_2);
        btnDevam = findViewById(R.id.btnDevam4_2);
        btnDevam.setVisibility(View.INVISIBLE);

    }

    public  void calistir4_2(View view) {
        btnDevam.setVisibility(View.VISIBLE);
        tvCevap.setText("4.0");
    }
    public  void devam4_2(View view) {
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton4_3.class);
        startActivity(intent);
    }
}
