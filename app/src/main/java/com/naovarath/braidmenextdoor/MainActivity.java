package com.naovarath.braidmenextdoor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btProfil, btReservation, btMessagerie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1:charger le XML
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
    }

    public void btReservation(View view) {
    }

    public void btMessagerie(View view) {
    }
}
