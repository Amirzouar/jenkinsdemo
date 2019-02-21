package com.example.atelier03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
private Spinner spForme;
private Button btnValid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        spForme=(Spinner)findViewById(R.id.spForme);
        btnValid=(Button) findViewById(R.id.btnValid);
        ajouterEcouteur();

    }

    private void ajouterEcouteur() {
        btnValid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valider();
            }
        });
    }

    private void valider() {
        Intent i;
        switch (spForme.getSelectedItemPosition()){
            case 0:i=new Intent(MainActivity.this,Rectangle.class);startActivity(i);break;
            case 1:i=new Intent(MainActivity.this,Cercle.class);startActivity(i);break;
            case 2:i=new Intent(MainActivity.this,Triangle.class);startActivity(i);break;
        }
    }
}
