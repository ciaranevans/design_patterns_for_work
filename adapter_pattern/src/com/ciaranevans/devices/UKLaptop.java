package com.ciaranevans.devices;

import com.ciaranevans.plugs.UKPluggable;

public class UKLaptop implements UKPluggable {
    @Override
    public void insertIntoUKPlug() {
        System.out.println("I've just been successfully plugged in as a UK Laptop");
    }
}
