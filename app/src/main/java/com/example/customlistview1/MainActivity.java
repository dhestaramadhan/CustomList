package com.example.customlistview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        //Create data
        ArrayList<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person(R.drawable.fubuki,"Shirakami Fubuki","Hololive Gamers"));
        arrayList.add(new Person(R.drawable.aqua,"Minato Aqua","Hololoive Gen 2"));
        arrayList.add(new Person(R.drawable.ayame,"Ayame Nakiri","Hololive Gen 2"));
        arrayList.add(new Person(R.drawable.rushia,"Uruha Rushia","Hololive Gen 3/Hololive Fantasy"));
        arrayList.add(new Person(R.drawable.watson,"Watson Amelia","Hololive English"));

        //Custom Adapter
        PersonAdapter personAdapter = new PersonAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(personAdapter);

    }
}