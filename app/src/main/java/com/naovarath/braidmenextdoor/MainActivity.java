package com.naovarath.braidmenextdoor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btProfil, btReservation, btMessagerie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1:charge le XML
        setContentView(R.layout.activity_main);

        //2:recuperation
        btProfil = findViewById(R.id.btProfil);
        btReservation = findViewById(R.id.btReservation);
        btMessagerie = findViewById(R.id.btMessagerie);

        //3:abonnement au callback du click
        btProfil.setOnClickListener((View.OnClickListener) this);
        btReservation.setOnClickListener((View.OnClickListener) this);
        btMessagerie.setOnClickListener((View.OnClickListener) this);
    }

    public void btProfil(View view) {
        //affiche un toast
        Toast.makeText(MainActivity.this, "Gestion du profil", Toast.LENGTH_SHORT).show();

        //redirection vers le profil layout
        startActivity(new Intent(this,Profil.class));
    }

    public void btReservation(View view) {
        //affiche un toast
        Toast.makeText(MainActivity.this, "Accès à la réservation", Toast.LENGTH_SHORT).show();
    }

    public void btMessagerie(View view) {
        //affiche un toast
        Toast.makeText(MainActivity.this, "Accès à la messagerie", Toast.LENGTH_SHORT).show();
    }
}
