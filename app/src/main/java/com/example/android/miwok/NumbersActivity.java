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
        listaReci.add("eleven");
        listaReci.add("twelve");
        listaReci.add("threeteen");
        listaReci.add("fourteen");
        listaReci.add("fiveteen");
        listaReci.add("sixteen");
        listaReci.add("seventeen");
        listaReci.add("eighteen");
        listaReci.add("nineteen");
        listaReci.add("twenty");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaReci);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
