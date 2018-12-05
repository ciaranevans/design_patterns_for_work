package com.ciaranevans.products;

import com.ciaranevans.Visitable;
import com.ciaranevans.Visitor;

public class Cauliflower implements Vegetable, Visitable {
    @Override
    public double getPrice() {
        return 0.89;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
