package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> listaReci = new ArrayList<Word>();
        listaReci.add(new Word("father","әpә"));
        listaReci.add(new Word("mother","әṭa"));
        listaReci.add(new Word("son","angsi"));
        listaReci.add(new Word("daughter","tune"));
        listaReci.add(new Word("older brother","taachi"));
        listaReci.add(new Word("younger brother","chalitti"));
        listaReci.add(new Word("older sister","teṭe"));
        listaReci.add(new Word("younger sister","kolliti"));
        listaReci.add(new Word("grandmother","ama"));
        listaReci.add(new Word("grandfather","paapa"));


        WordAdapter adapter = new WordAdapter(this, listaReci);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
