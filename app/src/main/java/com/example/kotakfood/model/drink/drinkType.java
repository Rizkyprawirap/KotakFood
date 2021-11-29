package com.example.kotakfood.model.drink;

import android.os.Parcel;
import android.os.Parcelable;

public class drinkType extends drinkBase implements Parcelable {

    String drinkName;
    Integer drinkPrice;
    int drinkImage;

    public drinkType(String drinkName, Integer drinkPrice, int drinkImage) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkImage = drinkImage;
    }

    protected drinkType(Parcel in) {
        drinkName = in.readString();
        if (in.readByte() == 0) {
            drinkPrice = null;
        } else {
            drinkPrice = in.readInt();
        }
    }

    public static final Creator<drinkType> CREATOR = new Creator<drinkType>() {
        @Override
        public drinkType createFromParcel(Parcel in) {
            return new drinkType(in);
        }

        @Override
        public drinkType[] newArray(int size) {
            return new drinkType[size];
        }
    };

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public Integer getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(Integer drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public Integer getDrinkImage() {
        return drinkImage;
    }

    public void setDrinkImage(Integer drinkImage) {
        this.drinkImage = drinkImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
