package com.example.kotakfood.model.drink;

import com.example.kotakfood.model.drink.drinkBase;

public class drinkLogic {
    private static drinkBase db = null;
    public static drinkBase get() {
        if(db == null){
            db = new drinkBase();
        }
        return db;
    }

}
