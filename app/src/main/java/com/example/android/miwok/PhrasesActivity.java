package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> listaReci = new ArrayList<Word>();
        listaReci.add(new Word("Where are you going?","minto wuksus"));
        listaReci.add(new Word("What is your name?","tinnә oyaase'nә"));
        listaReci.add(new Word("My name is...","oyaaset..."));
        listaReci.add(new Word("How are you feeling?","michәksәs?"));
        listaReci.add(new Word("I’m feeling good.","kuchi achit"));
        listaReci.add(new Word("Are you coming?","әәnәs'aa?"));
        listaReci.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        listaReci.add(new Word("I’m coming.","әәnәm"));
        listaReci.add(new Word("Let’s go.","yoowutis"));
        listaReci.add(new Word("Come here.","әnni'nem"));


        final WordAdapter adapter = new WordAdapter(this, listaReci);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
