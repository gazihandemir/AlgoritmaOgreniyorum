package com.example.algoritmaogreniyorum.AlgoritmaBahcesi5;

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

public class AlgoritmaBahcesiButton5_2 extends AppCompatActivity {
    EditText edCevap;
    Button btnDevam;
    static String cevap = "12";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button5_2);
        btnDevam = findViewById(R.id.btnDevamAlgo5_2);
        btnDevam.setVisibility(View.INVISIBLE);
        edCevap = findViewById(R.id.edCevapAlgo5_2);

    }

    public void calistirAlgo5_2(View view) {
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
            text.setText("Yanlis Cevap!");
            text.setTextSize(24);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.BOTTOM, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }
    }

    public void devamAlgo5_2(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton5_3.class);
        startActivity(intent);
    }
}
