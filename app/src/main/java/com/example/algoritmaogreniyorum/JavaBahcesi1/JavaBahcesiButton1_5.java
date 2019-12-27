package com.example.algoritmaogreniyorum.JavaBahcesi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class JavaBahcesiButton1_5 extends AppCompatActivity {
    EditText edCevap;
    Button btndevam;
    static String cevap = "System.out.println";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button1_5);
        btndevam = findViewById(R.id.btnDevam1_5);
        edCevap = findViewById(R.id.edCevap1_5);
        btndevam.setVisibility(View.INVISIBLE);
    }

    public void calistir1_5(View view) {
        String cevap = "System.out.println";

        if (cevap.contentEquals(edCevap.getText().toString()) || edCevap.getText().toString().equals("")) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("Tebrikler ! ");
            text.setTextSize(24);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.BOTTOM, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
            btndevam.setVisibility(View.VISIBLE);

        } else {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout2,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("Emin misin");
            text.setTextSize(24);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.BOTTOM, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }
    }

    public void devam1_5(View view) {
        Intent intent = new Intent(getApplicationContext(), JavaBahcesiButton1_6.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
