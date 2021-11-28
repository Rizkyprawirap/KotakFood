package com.example.kotakfood.model;

import android.os.Parcel;
import android.os.Parcelable;

public class foodType extends foodBase implements Parcelable {

    String foodName;
    Integer foodPrice;
    int foodImage;

    public foodType(String foodName, Integer foodPrice, int foodImage) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodImage = foodImage;
    }

    protected foodType(Parcel in) {
        foodName = in.readString();
        if (in.readByte() == 0) {
            foodPrice = null;
        } else {
            foodPrice = in.readInt();
        }
        foodImage = in.readInt();
    }

    public static final Creator<foodType> CREATOR = new Creator<foodType>() {
        @Override
        public foodType createFromParcel(Parcel in) {
            return new foodType(in);
        }

        @Override
        public foodType[] newArray(int size) {
            return new foodType[size];
        }
    };

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Integer foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(foodName);
        if (foodPrice == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(foodPrice);
        }
        dest.writeInt(foodImage);
    }
}
