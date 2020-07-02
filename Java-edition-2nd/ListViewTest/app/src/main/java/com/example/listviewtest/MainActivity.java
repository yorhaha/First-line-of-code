package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    private String[] data = {"Hello_1", "Hello_1", "Hello_1", "Hello_1", "Hello_1", "Hello_1",
            "Hello_1", "Hello_1", "Hello_1", "Hello_1", "Hello_1", "Hello_1", "Hello_1",
            "Hello_1", "Hello_1", "Hello_1", "Hello_1", "Hello_1", "Hello_1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void initFruits() {
        for (int i = 0; i < 2; i++){
            Fruit apple = new Fruit("Apple", R.drawable.ic_launcher_background);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.ic_launcher_background);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.ic_launcher_background);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.ic_launcher_background);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.drawable.ic_launcher_background);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.drawable.ic_launcher_background);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.ic_launcher_background);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.ic_launcher_background);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry", R.drawable.ic_launcher_background);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango", R.drawable.ic_launcher_background);
            fruitList.add(mango);
        }
    }
}
