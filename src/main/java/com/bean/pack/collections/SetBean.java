package com.bean.pack.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetBean {

    private Set set;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Object getElementByID(int id) {

        int i = 0;
        if (set.size() > id) {
            for (Object l : set) {
                if (i == id) {
                    return l;
                }
                i++;
            }
        }
        return "not found!";
    }
}
