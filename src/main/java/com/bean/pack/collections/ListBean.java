package com.bean.pack.collections;

import java.util.List;

public class ListBean {

    private String text;
    private List list;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setList(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }

    public Object getElementByID(int id) {
        if (list.size()>id) return list.get(id);
        else return "not found!";
    }
}
