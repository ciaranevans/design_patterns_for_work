package com.ciaranevans.products;

import com.ciaranevans.Visitable;
import com.ciaranevans.Visitor;

public class Apple implements Fruit, Visitable {
    @Override
    public double getPrice() {
        return 0.5;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
