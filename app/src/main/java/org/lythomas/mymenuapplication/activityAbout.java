package org.lythomas.mymenuapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class activityAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_about);
        setTitle("Apropos");
        TextView v = findViewById(R.id.DateJ);
        Date currentTime = Calendar.getInstance().getTime();
        v.setText(currentTime.toString());
    }
}
