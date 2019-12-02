package com.fsemicolon.mydes;

public class HomeGridClass {

    private int imageResourceID;

    private String imageDescription;



    public int getImageResourceID() {
        return imageResourceID;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public HomeGridClass(int imageResourceID, String imageDescription) {
        this.imageResourceID = imageResourceID;
        this.imageDescription = imageDescription;
    }
}
