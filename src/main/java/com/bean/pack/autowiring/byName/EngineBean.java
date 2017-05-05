package com.bean.pack.autowiring.byName;


public class EngineBean {

    public String engineType;

    public EngineBean() {
        System.out.println(" - Engine bean created!");
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
