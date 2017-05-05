package com.bean.pack.autowiring.byName;

public class AudiBean {

    private String audiModel;
    private EngineBean engineBean;
    private WheelsBean wheelsBean;

    public String getAudiModel() {
        return audiModel;
    }

    public void setAudiModel(String audiModel) {
        this.audiModel = audiModel;
    }

    public void setEngineBean(EngineBean engineBean) {
        this.engineBean = engineBean;
    }

    public String getEngineType() {
        return engineBean.getEngineType();
    }

    public String getWheelsType() {
        return wheelsBean.getWheelsType();
    }

    public int getWheelsSize() {
       return wheelsBean.getWheelsSize();
    }

    public void setWheelsBean(WheelsBean wheelsBean) {
        this.wheelsBean = wheelsBean;
    }
}
