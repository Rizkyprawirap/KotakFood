package com.example.kotakfood.model.drink;

import android.os.Parcel;
import android.os.Parcelable;

public class drinkOrder implements Parcelable {

    String name;
    Integer drinkPrice, drink;
    int drinkImage;

    public drinkOrder(String name, Integer drinkPrice, Integer drink, int drinkImage) {
        this.name = name;
        this.drinkPrice = drinkPrice;
        this.drink = drink;
        this.drinkImage = drinkImage;
    }

    protected drinkOrder(Parcel in) {
        name = in.readString();
        if (in.readByte() == 0) {
            drinkPrice = null;
        } else {
            drinkPrice = in.readInt();
        }
        if (in.readByte() == 0) {
            drink = null;
        } else {
            drink = in.readInt();
        }
        drinkImage = in.readInt();
    }

    public static final Creator<drinkOrder> CREATOR = new Creator<drinkOrder>() {
        @Override
        public drinkOrder createFromParcel(Parcel in) {
            return new drinkOrder(in);
        }

        @Override
        public drinkOrder[] newArray(int size) {
            return new drinkOrder[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(Integer drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public Integer getDrink() {
        return drink;
    }

    public void setDrink(Integer drink) {
        this.drink = drink;
    }

    public int getDrinkImage() {
        return drinkImage;
    }

    public void setDrinkImage(int drinkImage) {
        this.drinkImage = drinkImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        if (drinkPrice == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(drinkPrice);
        }
        if (drink == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(drink);
        }
        dest.writeInt(drinkImage);
    }
}
