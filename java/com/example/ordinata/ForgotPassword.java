package com.example.ordinata;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {

    private EditText mforgetpassword;
    private Button mpasswordrecoverbutton;
    private TextView mgobacktologin;

    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        getSupportActionBar().hide();
        mforgetpassword=findViewById(R.id.forgetpassword);
        mpasswordrecoverbutton=findViewById(R.id.passwordrecoverbutton);
        mgobacktologin=findViewById(R.id.gobacktologin);

        firebaseAuth=FirebaseAuth.getInstance();

        mgobacktologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ForgotPassword.this, MainActivity.class));
            }
        });

        mpasswordrecoverbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail=mforgetpassword.getText().toString().trim();
                if(mail.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter your email first", Toast.LENGTH_SHORT).show();
                }
                else {
                    //we have to send password recover email
                    firebaseAuth.sendPasswordResetEmail(mail).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()) {
                                Toast.makeText(getApplicationContext(), "Mail sent!", Toast.LENGTH_SHORT).show();
                                finish();
                                startActivity(new Intent(ForgotPassword.this, MainActivity.class));
                            }
                            else {
                                Toast.makeText(getApplicationContext(), "Wrong Email or Email not registered!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

    }
}