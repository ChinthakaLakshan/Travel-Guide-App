package com.ayesha.travelbuddy;

public class AdapterFlipperModel {

    String name, state; //this is only string, not an array.. if you are using array adapter in adapterviewflipper, you have to use String[] to make it array.
    Integer image; //you have to apply the same as above.

    //We will create constructor, getter to get the variables and setter to set the variables value.


    public AdapterFlipperModel(String name, String state, Integer image) {
        this.name = name;
        this.state = state;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public Integer getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

}
