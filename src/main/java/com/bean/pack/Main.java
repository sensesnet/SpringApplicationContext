package com.bean.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"config.xml"});
        PersonBean man = (PersonBean) ac.getBean("person");
        man.sayHi();
        System.out.println(man.getName());
        man.setText("Hello!");
        man.sayHi();
        ((PersonBean) ac.getBean("person")).sayHi();
        System.out.println("Object 'PersonBean' created from singleton!");
        //
        AddressBean address = (AddressBean) ac.getBean("address");
        System.out.println("Town: " + address.getTown() + " Street: " + address.getStreet());
        //
        AccountBean accountBean = (AccountBean) ac.getBean("account");
        System.out.println("Account id=" + accountBean.getId()
                + " summary=" + accountBean.getSummary()
                + " person: name=" + accountBean.getPerson().getName()
                + " text=" + accountBean.getPerson().getText());
    }
}
