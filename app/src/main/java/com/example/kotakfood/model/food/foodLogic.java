package com.example.kotakfood.model.food;

import com.example.kotakfood.model.food.foodBase;

public class foodLogic {
    private static foodBase fb = null;
    public static foodBase get() {
        if(fb == null){
            fb = new foodBase();
        }
        return fb;
    }

}
