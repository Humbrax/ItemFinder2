package com.example.itemfinder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Login extends AppCompatActivity {
    private EditText txtLoginUser;
    private EditText txtLoginPass;
    private Button loginButton;
    private UserManager userManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

        txtLoginUser = findViewById(R.id.txtLoginUser);
        txtLoginPass = findViewById(R.id.txtLoginPass);
        loginButton = findViewById(R.id.btnLogin);


        userManager = UserManager.getInstance();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtLoginUser.getText().toString();
                String password = txtLoginPass.getText().toString();

                if (userManager.isValidUser(username, password)) {
                    Toast.makeText(Login.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Login.this, VistaGeneral.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, "Inicio de sesión fallido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


