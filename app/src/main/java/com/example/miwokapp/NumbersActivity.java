package com.example.miwokapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> listaReci = new ArrayList<Word>();
        listaReci.add(new Word("one","lutti"));
        listaReci.add(new Word("two","otiiko"));
        listaReci.add(new Word("three","tolokoosu"));
        listaReci.add(new Word("four","oyysa"));
        listaReci.add(new Word("five","massokka"));
        listaReci.add(new Word("six","temmokka"));
        listaReci.add(new Word("seven","kenekaku"));
        listaReci.add(new Word("eight","kawinta"));
        listaReci.add(new Word("nine","wo'e"));
        listaReci.add(new Word("ten","na'aacha"));

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for (Word word:listaReci
             ) {
            TextView wordView = new TextView(this);
            wordView.setText(word.getDefaultTranslation());
            rootView.addView(wordView);
        }

    }
}
