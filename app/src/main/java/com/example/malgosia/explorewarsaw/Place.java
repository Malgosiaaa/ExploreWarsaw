package com.example.malgosia.explorewarsaw;

public class Place {

    // Place name
    private String mName;

    // Place address
    private String mAddress;

    // Place webpage
    private String mWeb;

    // Place phone number
    private String mPhoneNumber;

    // Place image
    private int mImageResourceID;

    public Place(String Name, String Address, String Web, String PhoneNumber, int ImageResourceID) {
        mName = Name;
        mAddress = Address;
        mWeb = Web;
        mPhoneNumber = PhoneNumber;
        mImageResourceID = ImageResourceID;
    }

    // Get the place name
    public String getmName() {
        return mName;
    }

    // Get the place address
    public String getmAddress() {
        return mAddress;
    }

    // Get the place www address
    public String getmWeb() {
        return mWeb;
    }

    // Get the place phone number
    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    // Get the place image
    public int getmImageResourceID() {
        return mImageResourceID;
    }
}
