package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> listaReci = new ArrayList<String>();
        listaReci.add("one");
        listaReci.add("two");
        listaReci.add("three");
        listaReci.add("four");
        listaReci.add("five");
        listaReci.add("six");
        listaReci.add("seven");
        listaReci.add("eight");
        listaReci.add("nine");
        listaReci.add("ten");

        LinearLayout rootView=(LinearLayout)findViewById(R.id.rootView);

        for(int i=0;i<10;i++) {
            TextView txt = new TextView(this);
            txt.setText(listaReci.get(i));
            rootView.addView(txt);
        }
    }
}
