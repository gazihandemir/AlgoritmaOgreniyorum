package com.example.algoritmaogreniyorum.JavaBahcesi6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton6_2 extends AppCompatActivity {
    EditText edCevap;
    TextView tvCevap;
    Button btnDevam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button6_2);

        edCevap = findViewById(R.id.edCevap6_2);
        tvCevap = findViewById(R.id.tvCevap6_2);
        btnDevam = findViewById(R.id.btnDevam6_2);
        btnDevam.setVisibility(View.INVISIBLE);
    }

    public void calistir6_2(View view) {
        String cevap = edCevap.getText().toString();
        tvCevap.setText(cevap);
        btnDevam.setVisibility(View.VISIBLE);

    }

    public void devam6_2(View view) {
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton6_3.class);
        startActivity(intent);

    }
}
