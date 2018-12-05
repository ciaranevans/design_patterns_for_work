package com.ciaranevans.products;

import com.ciaranevans.Visitable;
import com.ciaranevans.Visitor;

public class FrenchStick implements Bread, Visitable {
    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
