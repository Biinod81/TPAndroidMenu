package org.lythomas.mymenuapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityTextPopUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_pop_up);
        setTitle("SaisieText");
    }

    public void valideValeur(View v){
        EditText edit = findViewById(R.id.SaisieText);

        Intent intentRetour=new Intent();
        intentRetour.putExtra("Valeur",edit.getText().toString());

        setResult(55,intentRetour);

        finish();
    }

    public void onBackPressed(){
        Intent intentRetour=new Intent();
        intentRetour.putExtra("Valeur","Saisie annulée");

        setResult(55,intentRetour);

        finish();
    }
}
