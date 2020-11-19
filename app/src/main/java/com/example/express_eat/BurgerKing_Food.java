package com.example.express_eat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class BurgerKing_Food extends AppCompatActivity {
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
                name = getResources().getStringArray(R.array.burgerkingburgers);
                price = getResources().getStringArray(R.array.burgerkingburgersprices);
                image = new int[] {R.drawable.angryhopper,R.drawable.angryhopperjrr,R.drawable.fourheesehoppereal,
                        R.drawable.whopper, R.drawable.pepperoni_bacon_whopper_jr_};
                break;
            case "specials":
                name = getResources().getStringArray(R.array.burgerkingspecials);
                price = getResources().getStringArray(R.array.burgerkingspecialsprices);
                image = new int[] {R.drawable.doubleaconingjreall,R.drawable.singlebaconkingjrmeal,
                        R.drawable.doublebbqbaconingreal, R.drawable.single_bacon_king};
                break;
            case "drinks":
                name = getResources().getStringArray(R.array.burgerkingdrinks);
                price = getResources().getStringArray(R.array.burgerkingdrinksprices);
                image =new int[] {R.drawable.cola,R.drawable.minute_maid_orange,R.drawable.bottled_water};
                break;
        }


        recyclerView = findViewById(R.id.recyclerView);
        FoodAdapter foodAdapter = new FoodAdapter(this, name, price, image);
        recyclerView.setAdapter(foodAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}