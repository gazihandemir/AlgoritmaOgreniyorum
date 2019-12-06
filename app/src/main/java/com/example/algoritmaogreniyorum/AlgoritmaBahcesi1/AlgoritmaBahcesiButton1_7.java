package com.example.algoritmaogreniyorum.AlgoritmaBahcesi1;

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

import com.example.algoritmaogreniyorum.AlgoritmaBahcesiActivity;
import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton1_7 extends AppCompatActivity {
    EditText edCevap;
    Button btnDevam;
    static String kelime = "ben bir efsaneyim";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button1_7);
        edCevap = findViewById(R.id.edCevapAlgo1_7);

        btnDevam = findViewById(R.id.btnDevamAlgo1_7);
        btnDevam.setVisibility(View.INVISIBLE);

    }
    public void calistirAlgo1_7(View view){
        if (kelime.contentEquals(edCevap.getText())){

            btnDevam.setVisibility(View.VISIBLE);
        }
        else {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout2,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("Tekrar deneyin ! ");
            text.setTextSize(24);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.BOTTOM, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }
    }
    public void devamAlgo1_7(View view){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = layout.findViewById(R.id.text);
        text.setText("TEBRİKLER ! 2. adıma geçtiniz ! ");
        text.setTextSize(36);
        text.setTextColor(Color.parseColor("#ffffff"));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
