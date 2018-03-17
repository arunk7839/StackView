package com.example.lenovo.stackview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.StackView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<StackItem> items;
    StackAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StackView sv = (StackView) findViewById(R.id.stackview);
        prepareStackData();

        //setting adapter
        adapter = new StackAdapter(getApplicationContext(), items);
        sv.setAdapter(adapter);


    }

    //setting data in item list
    void prepareStackData() {
        items = new ArrayList<StackItem>();
        items.add(new StackItem(R.drawable.froyo, "Froyo"));
        items.add(new StackItem(R.drawable.gingerbread, "GingerBread"));
        items.add(new StackItem(R.drawable.honeycomb, "HoneyComb"));
        items.add(new StackItem(R.drawable.icecream, "IceCream Sandwich"));
        items.add(new StackItem(R.drawable.jellybean, "JellyBean"));
        items.add(new StackItem(R.drawable.kitkat, "KitKat"));
        items.add(new StackItem(R.drawable.lollipop, "Lollipop"));
        items.add(new StackItem(R.drawable.marshmallow, "Marshmallow"));
        items.add(new StackItem(R.drawable.naugat, "Naugat"));
        items.add(new StackItem(R.drawable.oreo, "Oreo"));


    }
}
