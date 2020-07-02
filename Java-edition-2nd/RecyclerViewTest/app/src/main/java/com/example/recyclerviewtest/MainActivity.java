package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);

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
