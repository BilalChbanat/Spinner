package com.example.spiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner Subjects_spinner=findViewById(R.id.planets_spinner);
        ArrayList<ItemData> list= new ArrayList<ItemData>();
        list.add(new ItemData("Iphone s4",R.drawable.p1,"work with high speed"));
        list.add(new ItemData("Iphone 3",R.drawable.p2,"work with max high speed"));
        list.add(new ItemData("Iphone 5",R.drawable.p3,"work with bloooth"));
        list.add(new ItemData("Iphone 6 plus",R.drawable.p4,"work with item s"));
        SpinnerAdapter adapter1= new SpinnerAdapter(this,R.id.mainview,list);
        Subjects_spinner.setAdapter(adapter1);
    }
}