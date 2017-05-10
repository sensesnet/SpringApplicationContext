package com.bean.pack.autowiring.byType;


public class ColourBean {

    private String colourType;

    public ColourBean() {
        System.out.println(" - Colour bean created!");
    }

    public String getColourType() {
        return colourType;
    }

    public void setColourType(String colourType) {
        this.colourType = colourType;
    }
}
