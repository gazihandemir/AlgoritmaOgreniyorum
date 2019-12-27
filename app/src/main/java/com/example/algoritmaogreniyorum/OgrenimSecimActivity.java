package com.example.algoritmaogreniyorum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OgrenimSecimActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogrenim_secim);
    }

    public void javaBahcesiGiris(View view) {
        Intent intent = new Intent(getApplicationContext(), JavaBahcesiActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        System.out.println("Hello World");
    }

    public void algoritmaBahcesiGiris(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiActivity.class);
        startActivity(intent);


    }

    public void bilgilendir(View view) {
        Intent intent = new Intent(getApplicationContext(), Bilgilendirme.class);
        startActivity(intent);
    }
}
