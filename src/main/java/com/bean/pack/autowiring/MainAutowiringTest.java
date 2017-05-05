package com.bean.pack.autowiring;

import com.bean.pack.autowiring.byName.AudiBean;
import com.bean.pack.autowiring.byName.EngineBean;
import com.bean.pack.autowiring.byName.WheelsBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowiringTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");

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


    }
}
