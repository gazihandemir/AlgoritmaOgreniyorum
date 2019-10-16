package com.example.algoritmaogreniyorum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    EditText edName;
    EditText edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        edName = findViewById(R.id.edNameSignInActivity);
        edPassword = findViewById(R.id.edPasswordSingInActivity);

    }

    public void signInButton(View view) {
        String name = "1";
        String password = "1";
        if (name.equals(edName.getText().toString()) && password.equals(edPassword.getText().toString())) {
            // Intent
            Intent intent = new Intent(getApplicationContext(),OgrenimSecimActivity.class);
            startActivity(intent);
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("HOŞGELDİNİZ");
            text.setTextSize(36);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();

        } else {
            Toast.makeText(this, "Kullanıcı Adınız veya Şifreniz yanlış lütfen tekrar deneyiniz", Toast.LENGTH_SHORT).show();
        }
        Intent intent = new Intent(getApplicationContext(),OgrenimSecimActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    public void signUpButton(View view) {

    }

}

