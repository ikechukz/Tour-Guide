package com.ezeagu.android.tourguide;

public class Attraction {
    private int attractionName;
    private int attractionImage;
    private int description;

    public Attraction(int attractionName, int attractionImage, int description) {
        this.attractionName = attractionName;
        this.attractionImage = attractionImage;
        this.description = description;
    }

    public int getAttractionName() {
        return attractionName;
    }

    public int getAttractionImage() {
        return attractionImage;
    }

    public int getDescription() {
        return description;
    }

}
