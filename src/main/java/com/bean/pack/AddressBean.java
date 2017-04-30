package com.bean.pack;

public class AddressBean {

    private String town;
    private String street;

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    //Configuration bean by factory method
    private static AddressBean addressBean = null;

    public static AddressBean getInstance() {
        if (addressBean == null) {
            addressBean = new AddressBean();
        }else return addressBean;
        return addressBean;
    }
}
