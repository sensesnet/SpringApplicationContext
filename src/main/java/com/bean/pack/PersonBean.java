package com.bean.pack;

public class PersonBean {
    private String text;
    private String name;

    public PersonBean(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHi() {
        System.out.println(text);
    }


    //initialization
    public void init() {
        System.out.println("Initialization of person");
    }

    //destroy
    public void destroy() {
        System.out.println("Destroy of person");
    }

}
