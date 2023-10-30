package com.example.itemfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class Registro extends AppCompatActivity {
    private EditText txtRegisterUser;
    private EditText txtRegisterEmail;
    private EditText txtRegisterPass;
    private Button btnRegister;
    private UserManager userManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtRegisterUser = findViewById(R.id.txtRegisterUser);
        txtRegisterEmail = findViewById(R.id.txtRegisterEmail);
        txtRegisterPass = findViewById(R.id.txtRegisterPass);
        btnRegister = findViewById(R.id.btnRegister);

        // Obtener la instancia de UserManager
        userManager = UserManager.getInstance();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newUsername = txtRegisterUser.getText().toString();
                String newEmail = txtRegisterEmail.getText().toString();
                String newPassword = txtRegisterPass.getText().toString();

                // Verificar si el usuario ya existe
                if (userManager.isUserExists(newUsername)) {
                    Toast.makeText(Registro.this, "El usuario ya existe", Toast.LENGTH_SHORT).show();
                } else {
                    // Agregar el nuevo usuario a través de UserManager
                    userManager.addUser(new User(newUsername, newEmail, newPassword));

                    Toast.makeText(Registro.this, "Registro exitoso", Toast.LENGTH_SHORT).show();

                    // Puedes redirigir a la actividad de inicio de sesión o realizar alguna otra acción aquí
                }

                Intent intent = new Intent(Registro.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

