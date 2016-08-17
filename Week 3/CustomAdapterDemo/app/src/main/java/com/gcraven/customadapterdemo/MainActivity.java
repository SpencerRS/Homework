package com.gcraven.customadapterdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        ArrayList<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Animal("cow", "moo"));
        animalsList.add(new Animal("cat", "meow"));
        animalsList.add(new Animal("dog", "woof"));
        animalsList.add(new Animal("sheep", "baaaa"));

        CustomBaseAdapter adapter = new CustomBaseAdapter(this, animalsList);

        listView.setAdapter(adapter);

    }

}
