package com.bean.pack.autowiring.byConstructor;

public class BMWBean {
    private String model;
    private BMWColourBean bmwColourBean;

    public BMWBean(String model, BMWColourBean bmwColourBean) {
        this.model = model;
        this.bmwColourBean = bmwColourBean;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BMWColourBean getBmwColourBean() {
        return bmwColourBean;
    }

    public void setBmwColourBean(BMWColourBean bmwColourBean) {
        this.bmwColourBean = bmwColourBean;
    }
}
