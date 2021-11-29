package com.example.kotakfood.model.snack;

import android.os.Parcel;
import android.os.Parcelable;

public class snackType extends snackBase implements Parcelable {

    String snackName;
    Integer snackPrice;
    int snackImage;

    public snackType(String snackName, Integer snackPrice, int snackImage) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
        this.snackImage = snackImage;
    }

    protected snackType(Parcel in) {
        snackName = in.readString();
        if (in.readByte() == 0) {
            snackPrice = null;
        } else {
            snackPrice = in.readInt();
        }
        snackImage = in.readInt();
    }

    public static final Creator<snackType> CREATOR = new Creator<snackType>() {
        @Override
        public snackType createFromParcel(Parcel in) {
            return new snackType(in);
        }

        @Override
        public snackType[] newArray(int size) {
            return new snackType[size];
        }
    };

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public Integer getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(Integer snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getSnackImage() {
        return snackImage;
    }

    public void setSnackImage(int snackImage) {
        this.snackImage = snackImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(snackName);
        if (snackPrice == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(snackPrice);
        }
        dest.writeInt(snackImage);
    }
}
