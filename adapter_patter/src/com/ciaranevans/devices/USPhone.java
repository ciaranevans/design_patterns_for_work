package com.ciaranevans.devices;

import com.ciaranevans.plugs.USPluggable;

public class USPhone implements USPluggable {
    @Override
    public void insertIntoUSPlug() {
        System.out.println("I've just been successfully plugged in as a US Phone");
    }
}
