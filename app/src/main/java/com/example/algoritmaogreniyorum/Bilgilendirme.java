package com.example.algoritmaogreniyorum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bilgilendirme extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgilendirme);

    }

    public void devamBilgilendir(View view) {
        Intent intent = new Intent(getApplicationContext(), OgrenimSecimActivity.class);
        startActivity(intent);
    }
}
