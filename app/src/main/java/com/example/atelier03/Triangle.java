package com.example.atelier03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Triangle extends AppCompatActivity {
    private EditText cote;

    private Button btnCalcule;
    private EditText edP;
    private EditText edS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        init();

    }

    private void init() {
        cote=(EditText)findViewById(R.id.edCote);
        edP=(EditText)findViewById(R.id.edP);
        edS=(EditText)findViewById(R.id.edS);
        btnCalcule=(Button) findViewById(R.id.btnCalculeCa);
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
            String cot = cote.getText().toString();
            Double surface = Double.parseDouble(cot) * Double.parseDouble(cot);
            Double perimetre = 4 * (Double.parseDouble(cot));

            edP.setText(Double.toString(perimetre));
            edS.setText(Double.toString(surface));
        }catch (NumberFormatException e){
            Toast t=Toast.makeText(getApplicationContext(),"non valiiiiide ",Toast.LENGTH_LONG);
            t.show();

        }



    }

}
