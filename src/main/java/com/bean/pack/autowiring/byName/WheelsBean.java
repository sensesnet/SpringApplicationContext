package com.bean.pack.autowiring.byName;

public class WheelsBean {
    private String wheelsType;
    private int wheelsSize;

    public WheelsBean() {
        System.out.println(" - Wheels bean created!");
    }

    public String getWheelsType() {
        return wheelsType;
    }

    public void setWheelsType(String wheelsType) {
        this.wheelsType = wheelsType;
    }

    public int getWheelsSize() {
        return wheelsSize;
    }

    public void setWheelsSize(int wheelsSize) {
        this.wheelsSize = wheelsSize;
    }
}
