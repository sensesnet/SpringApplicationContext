package com.bean.pack;

import com.bean.pack.collections.ListBean;
import com.bean.pack.collections.SetBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"config.xml"});

        //take bean singleton
        PersonBean man = (PersonBean) ac.getBean("person");
        man.sayHi();
        System.out.println(man.getName());
        man.setText("Hello!");
        man.sayHi();
        ((PersonBean) ac.getBean("person")).sayHi();
        System.out.println("Object 'PersonBean' created from singleton!");

        //test factory-method
        AddressBean address = (AddressBean) ac.getBean("address");
        System.out.println("Town: " + address.getTown() + " Street: " + address.getStreet());

        //test param bean
        AccountBean accountBean = (AccountBean) ac.getBean("account");
        System.out.println("Account id=" + accountBean.getId()
                + " summary=" + accountBean.getSummary()
                + " person: name=" + accountBean.getPerson().getName()
                + " text=" + accountBean.getPerson().getText());

        //test list collection
        ListBean list = (ListBean) ac.getBean("list");
        System.out.println("List element:" + list.getList());
        for (Object l : list.getList()) {
            System.out.println("element = " + l);
        }
        System.out.println("element '0': " + list.getElementByID(0));
        System.out.println("element '4': " + list.getElementByID(4));
        System.out.println("element '5': " + list.getElementByID(5));
        System.out.println("element '10': " + list.getElementByID(10));

        //test set collection
        SetBean set = (SetBean) ac.getBean("set");
        System.out.println("Set element:" + set.getSet());
        for (Object l : set.getSet()) {
            System.out.println("element = " + l);
        }
        System.out.println("element '0': " + set.getElementByID(0));
        System.out.println("element '4': " + set.getElementByID(4));
        System.out.println("element '5': " + set.getElementByID(5));
        System.out.println("element '10': " + set.getElementByID(10));

        //test map collection
    }
}
