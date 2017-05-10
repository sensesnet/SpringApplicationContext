package com.bean.pack.dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCont
                = new ClassPathXmlApplicationContext("config.xml");

        GlobalInfo globalInfo = (GlobalInfo) appCont.getBean("globalInfo");
        System.out.println("INFO: " + globalInfo.getInfo());
        System.out.println("New news: " + globalInfo.getNews().getNews());
        globalInfo.getNews().message();

    }
}
