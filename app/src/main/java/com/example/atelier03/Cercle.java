package com.example.atelier03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cercle extends AppCompatActivity {
    private EditText rayon;

    private Button btnCalcule;
    private EditText edP;
    private EditText edS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cercle);
        init();

    }

    private void init() {
        rayon=(EditText)findViewById(R.id.edRayon);
        edP=(EditText)findViewById(R.id.edP);
        edS=(EditText)findViewById(R.id.edS);
        btnCalcule=(Button) findViewById(R.id.btnClaculeC);
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
            String rayonn = rayon.getText().toString();
            Double surface = Math.PI * Math.pow(Double.parseDouble(rayonn),2);
            Double perimetre =2 * (Double.parseDouble(rayonn))*Math.PI;
            edP.setText(Double.toString(perimetre));
            edS.setText(Double.toString(surface));
        }catch (NumberFormatException e){
            Toast t=Toast.makeText(getApplicationContext(),"non valiiiiide ",Toast.LENGTH_LONG);
            t.show();

        }



    }

}
