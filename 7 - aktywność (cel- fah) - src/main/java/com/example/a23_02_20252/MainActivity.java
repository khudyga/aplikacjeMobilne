package com.example.a23_02_20252;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void fahren (View view) {
        EditText editText = findViewById(R.id.liczba);
        String liczba = editText.getText().toString();
        TextView wynik = findViewById(R.id.wynik);

        double fah = Double.parseDouble(liczba);
        double fahrenheit = (fah * 9 / 5) + 32;
        wynik.setText(Double.toString(fahrenheit));
    }

    public void cels (View view) {
        EditText editText = findViewById(R.id.liczba);
        String liczba = editText.getText().toString();
        TextView wynik = findViewById(R.id.wynik);

        Double cels = Double.parseDouble(liczba);
        double celsius = (cels - 32) * 5/9;
        wynik.setText(Double.toString(celsius));
    }
}