package com.example.express_eat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Mcdo_Food extends AppCompatActivity {

    RecyclerView recyclerView;
    String name[],price[];
    int image[];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods_per_restaurant);

        String category = getIntent().getStringExtra("CATEGORY");
        switch(category){
            case "burger":
                name = getResources().getStringArray(R.array.mcdoburgers);
                price = getResources().getStringArray(R.array.mcdoburgerprices);
                image = new int[] {R.drawable.burgermcdoo,R.drawable.cheeseburgerr,
                        R.drawable.mcchickennn,R.drawable.cheessyburgermcdoo,
                        R.drawable.cheeseburger_deluxe,R.drawable.quarter_pounder_with_cheese,
                        R.drawable.doublebigmacc};
                break;
            case "fries":
                name = getResources().getStringArray(R.array.mcdofries);
                price = getResources().getStringArray(R.array.mcdofriesprices);
                image = new int[] {R.drawable.regularfriess,R.drawable.mediumfriess,
                        R.drawable.bfffriess,R.drawable.shakehakeriescheesee,R.drawable.shakehakeriesbbqq};
                break;
            case "drinks":
                name = getResources().getStringArray(R.array.mcdodrinks);
                price = getResources().getStringArray(R.array.mcdodrinksprices);
                image =new int[] {R.drawable.mcfloatttt,R.drawable.strawberryhakee,R.drawable.winterelonilkea};
                break;
            case "rice_meals":
                name = getResources().getStringArray(R.array.mcdoricemeals);
                price = getResources().getStringArray(R.array.mcdoricemealsprices);
                image = new int[] {R.drawable.chickenalaking,R.drawable.chickenfillett,
                        R.drawable.onepiecechickenn,R.drawable.twoieceshicken,R.drawable.chickenatsu,
                        R.drawable.onepieceushroomepperteak};
                break;
            case "desserts":
                name = getResources().getStringArray(R.array.mcdodesserts);
                price = getResources().getStringArray(R.array.mcdodessertsprices);
                image = new int[] {R.drawable.caramelsundae,R.drawable.chocolateundae,
                        R.drawable.coffee_mcflurry,R.drawable.mcflurryyy,};
                break;
        }
        recyclerView = findViewById(R.id.recyclerView);
        FoodAdapter foodAdapter = new FoodAdapter(this, name, price, image);
        recyclerView.setAdapter(foodAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
