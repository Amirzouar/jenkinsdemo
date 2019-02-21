package com.example.atelier03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Rectangle extends AppCompatActivity {
private EditText largeur;
private EditText longeur;
private Button btnCalcule;
private EditText edP;
private EditText edS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        init();
    }

    private void init() {
        largeur=(EditText)findViewById(R.id.edLageur);
        longeur=(EditText)findViewById(R.id.edLongeur);
        edP=(EditText)findViewById(R.id.edP);
        edS=(EditText)findViewById(R.id.edS);
        btnCalcule=(Button) findViewById(R.id.btnCalculR);
        ajouterEcouteur();
    }

    private void ajouterEcouteur() {
        btnCalcule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculer();
            }
        });
    }

    private void calculer() {
        try {
            String longu = longeur.getText().toString();
            String larg = largeur.getText().toString();
            Double surface = Double.parseDouble(longu) * Double.parseDouble(larg);
            Double perimetre = 2 * (Double.parseDouble(longu) + Double.parseDouble(larg));
            edP.setText(Double.toString(perimetre));
            edS.setText(Double.toString(surface));
        }catch (NumberFormatException e){
            Toast t=Toast.makeText(getApplicationContext(),"non valiiiiide ",Toast.LENGTH_LONG);
            t.show();

        }



    }
}
