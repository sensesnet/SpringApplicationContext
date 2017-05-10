package com.bean.pack.autowiring.byType;

public class SpeedBean {

    private double maxSpeedValue;

    public SpeedBean() {
        System.out.println(" - Speed bean created!");
    }

    public double getMaxSpeedValue() {
        return maxSpeedValue;
    }

    public void setMaxSpeedValue(double maxSpeedValue) {
        this.maxSpeedValue = maxSpeedValue;
    }
}
