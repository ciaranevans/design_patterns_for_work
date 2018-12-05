package com.ciaranevans;

import com.ciaranevans.devices.UKLaptop;
import com.ciaranevans.devices.USPhone;
import com.ciaranevans.plugs.UKPluggable;
import com.ciaranevans.plugs.USPluggable;
import com.ciaranevans.devices.USToUKAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final UKPluggable laptop = new UKLaptop();
        final USPluggable phone = new USPhone();

        final List<UKPluggable> thingsToPlugIntoMyUKSocket = new ArrayList<>();

        thingsToPlugIntoMyUKSocket.add(laptop); // This can only hold UK Pluggables

        thingsToPlugIntoMyUKSocket.forEach(UKPluggable::insertIntoUKPlug); // Only the laptop will be plugged in

        System.out.println("\r\nI went to the shop and bought an adapter...\r\n");

        // Need to use an adapter so that I can plug in my US Phone alongside my laptop when I'm on travels
        final UKPluggable phoneWithAdapter = new USToUKAdapter(phone);

        thingsToPlugIntoMyUKSocket.add(phoneWithAdapter); // Now I can plug in all my devices

        thingsToPlugIntoMyUKSocket.forEach(UKPluggable::insertIntoUKPlug);
    }
}
