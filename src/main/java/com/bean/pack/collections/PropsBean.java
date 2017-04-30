package com.bean.pack.collections;

import java.util.Properties;

public class PropsBean {
    private String text;
    private Properties props;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Properties getProps() {
        return props;
    }
}
