package com.bean.pack.autowiring.byType;

public class MercedesBean {

    private String mercedesType;
    private ColourBean colourBean;
    private SpeedBean speedBean;


    public String getMercedesType() {
        return mercedesType;
    }

    public void setMercedesType(String mersedesType) {
        this.mercedesType = mersedesType;
    }

    public String getColourType() {
        return colourBean.getColourType();
    }

    public void setColourBean(ColourBean colourBean) {
        this.colourBean = colourBean;
    }

    public double getSpeedType() {
        return speedBean.getMaxSpeedValue();
    }

    public void setSpeedBean(SpeedBean speedBean) {
        this.speedBean = speedBean;
    }
}
