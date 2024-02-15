package com.example.latihan1pplg2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText txtusername;
    EditText txtpassword;
    Button btnlogin;
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constrain_layout);

        txtusername = findViewById(R.id.txtusername);
        txtpassword = findViewById(R.id.txtpassword);
        btnlogin = findViewById(R.id.btnlogin);
        btnregister = findViewById(R.id.btnregister);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtusername.getText().toString();
                String password = txtpassword.getText().toString();

                if (username.equals("1") && password.equals("1")) {
                    Intent intent = new Intent(MainActivity.this, Kalkulator.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Login gagal. Cek kembali username dan password.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}