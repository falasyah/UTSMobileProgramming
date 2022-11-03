package com.example.utsmobileprogramming;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String username="mustofa";

    String password="mustofa";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtUser=findViewById(R.id.txtUser);

        EditText txtPass=findViewById(R.id.txtPass);

        Button login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                if(txtUser.getText().toString().equalsIgnoreCase(username)&& txtPass.getText().toString().equalsIgnoreCase(password)) {

                    startActivity(new Intent(MainActivity.this, MenuUtama.class));

                }else{

                    Toast.makeText(MainActivity.this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();

                }

            }

        });

    }
}