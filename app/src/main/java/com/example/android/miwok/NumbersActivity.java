package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

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


        WordAdapter adapter = new WordAdapter(this, listaReci);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
