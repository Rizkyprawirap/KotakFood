package com.example.kotakfood.model.drink;

public class drinkOrderConnection {

    private static drinkOrderBase doc = null;

    public static drinkOrderBase get() {
        if(doc == null){
            doc = new drinkOrderBase();
        }
        return doc;
    }
}
