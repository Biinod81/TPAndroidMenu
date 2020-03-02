package org.lythomas.mymenuapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.monmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_rechercher :
                Intent intent = new Intent(MainActivity.this, ActivityTextPopUp.class);
                startActivityForResult(intent,55);
                return true;
            case R.id.menu_about :
                Intent intentAbout = new Intent(MainActivity.this,activityAbout.class);
                startActivity(intentAbout);
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }
    }

    public void onActivityResult(int resquestCode, int resultCode, Intent data){
        super.onActivityResult(resquestCode,resultCode,data);
        if(resquestCode==55){
            String valeur = data.getStringExtra("Valeur");

            ListView list = findViewById(R.id.listeValeur);

            String[] tabValeurs = {"anthony"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item,tabValeurs);

            list.setAdapter(adapter);
        }
    }
}
