package com.ciaranevans;

import com.ciaranevans.products.Bread;
import com.ciaranevans.products.Fruit;
import com.ciaranevans.products.Vegetable;

public interface Visitor {
    void visit(final Fruit fruit);
    void visit(final Vegetable vegetable);
    void visit(final Bread bread);
}
