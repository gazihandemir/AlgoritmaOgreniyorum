package com.example.algoritmaogreniyorum.AlgoritmaBahcesi9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton9_4 extends AppCompatActivity {
        Button btnDevam;
        EditText edCevap;
        static String cevap ="Dogru";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button9_4);
        btnDevam = findViewById(R.id.btnDevamAlgo9_4);
        btnDevam.setVisibility(View.INVISIBLE);
        edCevap = findViewById(R.id.edCevapAlgo9_4);

    }
    public void calistirAlgo9_4(View view){
        if (cevap.contentEquals(edCevap.getText().toString())) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("TEBRİKLER ! ");
            text.setTextSize(36);
            text.setTextColor(Color.parseColor("#ffffff"));

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
            btnDevam.setVisibility(View.VISIBLE);
        } else {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout2,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("Emin misin !  ");
            text.setTextSize(24);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.BOTTOM, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }
    }public void devamAlgo9_4(View view) {
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton9_5.class);
        startActivity(intent);
    }
}
