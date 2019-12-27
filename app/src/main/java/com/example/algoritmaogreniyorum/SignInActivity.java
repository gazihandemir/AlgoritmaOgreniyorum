package com.example.algoritmaogreniyorum;

import androidx.annotation.NonNull;
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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignInActivity extends AppCompatActivity {
    EditText edName;
    EditText edPassword;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        edName = findViewById(R.id.edNameSignInActivity);
        edPassword = findViewById(R.id.edPasswordSingInActivity);
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
         /*  if(user != null){
            Intent ıntent = new Intent(SignInActivity.this,OgrenimSecimActivity.class);
            startActivity(ıntent);
        }
      */
    }

    public void signInButton(View view) {

        mAuth.signInWithEmailAndPassword(edName.getText().toString(), edPassword.getText().toString()).
                addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent ıntent = new Intent(SignInActivity.this, OgrenimSecimActivity.class);
                            startActivity(ıntent);
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

                            Toast.makeText(SignInActivity.this, "Kullanıcı Adınız veya Şifreniz yanlış lütfen tekrar deneyiniz", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    public void signUpButton(View view) {
        mAuth.createUserWithEmailAndPassword(edName.getText().toString(), edPassword.getText().toString()).
                addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent intent = new Intent(getApplicationContext(), OgrenimSecimActivity.class);
                            startActivity(intent);
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                if (e != null) {
                    Toast.makeText(SignInActivity.this, "Kayıt esnasında bir hata oluştu", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }

}

