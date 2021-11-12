package com.example.insight;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AnlatyicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anlatyic);
        Toast.makeText(this, "Auto budget planner", Toast.LENGTH_LONG).show();
    }
}