package com.ciaranevans.devices;

import com.ciaranevans.plugs.UKPlugable;

public class UKLaptop implements UKPlugable {
    @Override
    public void insertIntoUKPlug() {
        System.out.println("I've just been successfully plugged in as a UK Laptop");
    }
}
