package com.example.ex013;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    RadioButton b1, b2, b3, b4;
    RadioGroup rg;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = findViewById(R.id.switch1);
        layout = findViewById(R.id.layout);
        b1 = findViewById(R.id.radioButton);
        b2 = findViewById(R.id.radioButton2);
        b3 = findViewById(R.id.radioButton3);
        b4 = findViewById(R.id.radioButton4);
        rg = findViewById(R.id.toggleButton);

    }

    public void clicked(View view)
    {
        if (sw.isChecked())
        {
            if (b1.isChecked())
            {
                layout.setBackgroundColor(Color.RED);
            }
            else if (b2.isChecked())
            {
                layout.setBackgroundColor(Color.GREEN);
            }
            else if (b3.isChecked())
            {
                layout.setBackgroundColor(Color.BLUE);
            }
            else
            {
                layout.setBackgroundColor(Color.WHITE);
            }
        }
        rg.clearCheck();
    }
}