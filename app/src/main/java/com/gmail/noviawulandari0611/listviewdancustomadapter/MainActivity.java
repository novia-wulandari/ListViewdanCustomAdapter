package com.gmail.noviawulandari0611.listviewdancustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String  Item[] = {"Apple", "Banana", "Lemon", "Cherry", "Strawberry", "Avocado"};
    String  SubItem[] = {"The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.",
            "The banana is an edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa.",
            "The lemon, Citrus limon Osbeck, is a species of small evergreen tree in the flowering plant family Rutaceae, native to Asia.",
            "A cherry is the fruit of many plants of the genus Prunus, and is a fleshy drupe.",
            "The garden strawberry is a widely grown hybrid species of the genus Fragaria, collectively known as the strawberries.",
            "The avocado is a tree, long thought to have originated in South Central Mexico, classified as a member of the flowering plant family Lauraceae."};
    int flags[] = {R.drawable.apple, R.drawable.banana, R.drawable.lemon, R.drawable.cherry, R.drawable.strawberrie, R.drawable.avocado};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item,SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }
}

