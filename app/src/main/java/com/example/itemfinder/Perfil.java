package com.example.itemfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Perfil extends AppCompatActivity {

    private TextView usernameTextView;
    private TextView emailTextView;
    private UserManager userManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil2);

        usernameTextView = findViewById(R.id.textViewNombre);
        emailTextView = findViewById(R.id.textViewEmail);

        userManager = UserManager.getInstance();

        User currentUser = userManager.getCurrentUser();

        if (currentUser != null) {
            usernameTextView.setText(currentUser.getUsername());
            emailTextView.setText(currentUser.getEmail());
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(Perfil.this, VistaGeneral.class);
                } else if (item.getItemId() == R.id.action_profile) {
                    intent = new Intent(Perfil.this, Perfil.class);
                }
                if (intent != null) {
                    startActivity(intent);
                }
                return true;
            }
        });
    }
}
