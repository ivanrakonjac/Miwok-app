package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> listaReci = new ArrayList<Word>();
        listaReci.add(new Word("red","weṭeṭṭi"));
        listaReci.add(new Word("green","chokokki"));
        listaReci.add(new Word("brown","ṭakaakki"));
        listaReci.add(new Word("gray","ṭopoppi"));
        listaReci.add(new Word("black","kululli"));
        listaReci.add(new Word("white","kelelli"));
        listaReci.add(new Word("dusty yellow","ṭopiisә"));
        listaReci.add(new Word("mustard yellow","chiwiiṭә"));


        WordAdapter adapter = new WordAdapter(this, listaReci);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
