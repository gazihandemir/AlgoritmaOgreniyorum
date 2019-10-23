package com.example.algoritmaogreniyorum.JavaBahcesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.algoritmaogreniyorum.JavaBahcesiActivity;
import com.example.algoritmaogreniyorum.R;
public class JavaBahcesiButton2_5 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button2_5);
        btnDevam = findViewById(R.id.btnDevam2_5);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevap2_5);

    }
    public void calistir2_5(View view){
        tvCevap.setText("Hata ! ");
        btnDevam.setVisibility(View.VISIBLE);
    }
    public void devam2_5(View view){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = layout.findViewById(R.id.text);
        text.setText("TEBRİKLER 3. ADIMA GEÇTİNİZ!");
        text.setTextSize(36);
        text.setTextColor(Color.parseColor("#FF4444"));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
        Intent intent = new Intent(getApplicationContext(), JavaBahcesiActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);


    }
}
