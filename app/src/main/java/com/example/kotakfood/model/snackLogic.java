package com.example.kotakfood.model;

public class snackLogic {
    private static snackBase sb = null;

    public static snackBase get(){
        if(sb == null){
            sb = new snackBase();
        }
        return sb;
    }

}
