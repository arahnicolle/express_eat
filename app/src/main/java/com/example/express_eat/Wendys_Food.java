package com.example.express_eat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Wendys_Food extends AppCompatActivity {
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
                name = getResources().getStringArray(R.array.wendysburgers);
                price = getResources().getStringArray(R.array.wendysburgersprices);
                image = new int[] {R.drawable.steakhouseheeseburger,R.drawable.hamburger_sandwich_cheese,R.drawable.cheeseburger_deluxe_combo,
                        R.drawable.bacon_cheeseburger_ala_carte,R.drawable.bacon_cheeseburger_combo};
                break;
            case "drinks":
                name = getResources().getStringArray(R.array.wendysdrinks);
                price = getResources().getStringArray(R.array.wendysdrinksprices);
                image = new int[] {R.drawable.cola,R.drawable.frappeendys,
                        R.drawable.sprite_,R.drawable.bottled_water};
                break;
            case "fambox":
                name = getResources().getStringArray(R.array.wendysfambox);
                price = getResources().getStringArray(R.array.wendysfamboxprices);
                image =new int[] {R.drawable.fambox_fried_chicken,R.drawable.fambox_burgers,
                        R.drawable.fambox_baconator_single, R.drawable.fambox_baconator_single};
                break;
            case "whattabox":
                name = getResources().getStringArray(R.array.wendyswhattabox);
                price = getResources().getStringArray(R.array.wendyswhattaboxprices);
                image =new int[] {R.drawable.whattabox_a,R.drawable.whattabox_b,
                        R.drawable.one_piece_chicken,};
                break;
        }
        recyclerView = findViewById(R.id.recyclerView);
        FoodAdapter foodAdapter = new FoodAdapter(this, name, price, image);
        recyclerView.setAdapter(foodAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}