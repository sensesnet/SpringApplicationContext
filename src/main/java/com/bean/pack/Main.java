package com.bean.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String []args){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        LabRat rat = (LabRat) ac.getBean("rat");
        rat.sayHi();
        System.out.println(rat.getName());
        rat.setText("Hello!");
        rat.sayHi();
        System.out.println("Object Rat created from singleton!");
    }

}
