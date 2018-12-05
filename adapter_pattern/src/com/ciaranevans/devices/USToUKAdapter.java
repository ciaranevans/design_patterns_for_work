package com.ciaranevans.devices;

import com.ciaranevans.plugs.UKPluggable;
import com.ciaranevans.plugs.USPluggable;

public class USToUKAdapter implements UKPluggable {

    private USPluggable usPluggable;

    public USToUKAdapter(final USPluggable usPluggable) {
        this.usPluggable = usPluggable;
    }

    @Override
    public void insertIntoUKPlug() {
        System.out.println("I've put an adapter onto my US pluggable");
        this.usPluggable.insertIntoUSPlug();
    }
}
