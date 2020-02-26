package org.lythomas.mymenuapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
                Toast.makeText(getApplicationContext(),"rechercher",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_about :
                Toast.makeText(getApplicationContext(),"à propros",Toast.LENGTH_SHORT).show();
                setContentView(R.layout.layout_about);
                setTitle("Apropos");
                TextView v = new TextView(getApplicationContext());
                v.findViewById(R.id.dateDuJ);
                Date currentTime = Calendar.getInstance().getTime();
                v.setText(currentTime.toString());
                return true;
            default :
                return super.onOptionsItemSelected(item);
        }
    }
}
