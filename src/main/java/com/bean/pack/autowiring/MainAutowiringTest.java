package com.bean.pack.autowiring;

import com.bean.pack.autowiring.byConstructor.BMWBean;
import com.bean.pack.autowiring.byName.AudiBean;
import com.bean.pack.autowiring.byName.EngineBean;
import com.bean.pack.autowiring.byName.WheelsBean;
import com.bean.pack.autowiring.byType.MercedesBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowiringTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");


        //autowiring by name
        EngineBean engineBean = (EngineBean) ac.getBean("engineBean");
        engineBean.setEngineType("1.8 TFSI");

        WheelsBean wheelsBean = (WheelsBean) ac.getBean("wheelsBean");
        wheelsBean.setWheelsType("Alutec 'Germany' Poison Black Diamond");
        wheelsBean.setWheelsSize(18);

        AudiBean audiBean = (AudiBean) ac.getBean("audi");
        audiBean.setAudiModel("Audi a4");
        System.out.println("Model type: " + audiBean.getAudiModel());
        System.out.println("Engine type: " + audiBean.getEngineType());
        System.out.println("Wheels type: " + audiBean.getWheelsType());
        System.out.println("Wheels size: " + audiBean.getWheelsSize());


        //autowiring by type
        MercedesBean mercedesBean = (MercedesBean) ac.getBean("mercedes");
        mercedesBean.setMercedesType("Mercedes Sl 350");

        System.out.println("Model type: " + mercedesBean.getMercedesType());
        System.out.println("Colour: " + mercedesBean.getColourType());
        System.out.println("Mex speed: " + mercedesBean.getSpeedType());


        //autowiring by constructor
        BMWBean bmwBean = (BMWBean) ac.getBean("bmw");
        bmwBean.getBmwColourBean().setColour("white");
        System.out.println("Model type: " + bmwBean.getModel());
        System.out.println("Colour: " + bmwBean.getBmwColourBean().getColour());


    }
}
