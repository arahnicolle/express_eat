package com.example.express_eat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Jollibee_Food extends AppCompatActivity {
    RecyclerView recyclerView;
    String name[],price[];
    int image[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods_per_restaurant);
        String category = getIntent().getStringExtra("CATEGORY");
        switch(category){
            case "burger":
                name = getResources().getStringArray(R.array.jollibeeburgers);
                price = getResources().getStringArray(R.array.jollibeeburgersprices);
                image = new int[] {R.drawable.aloha,R.drawable.champp,R.drawable.doubleumburger,
                                   R.drawable.bacon_champ,R.drawable.cheesyumburger,
                                   R.drawable.bacon_cheesy_yumburger,};
                break;
            case "fries":
                name = getResources().getStringArray(R.array.jollibeefries);
                price = getResources().getStringArray(R.array.jollibeefries);
                image = new int[] {R.drawable.regularries,R.drawable.mediumriesjbb,R.drawable.crisscutries};
                break;
            case "drinks":
                name = getResources().getStringArray(R.array.jollibeedrinks);
                price = getResources().getStringArray(R.array.jollibeedrinks);
                image =new int[] {R.drawable.jollibeehake,R.drawable.pineappleuicerinks,
                        R.drawable.royalloat,R.drawable.jollibeecokefloat,R.drawable.hothocolate,
                        R.drawable.coffee};
                break;
            case "rice_meals":
                name = getResources().getStringArray(R.array.jollibeericemeals);
                price = getResources().getStringArray(R.array.jollibeericemealsprices);
                image = new int[] {R.drawable.twopieceurgerteak,R.drawable.ultimate_burger_steak,
                        R.drawable.twopieceshicken,R.drawable.onepiecehicken};
                break;
            case "desserts":
                name = getResources().getStringArray(R.array.jollibeedesserts);
                price = getResources().getStringArray(R.array.jollibeedessertsprices);
                image = new int[] {R.drawable.tuna_pie,R.drawable.peach_mango_pie,
                        R.drawable.chocolateundaewirl,R.drawable.mixinss,};
                break;
        }


        recyclerView = findViewById(R.id.recyclerView);
        FoodAdapter foodAdapter = new FoodAdapter(this, name, price, image);
        recyclerView.setAdapter(foodAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
