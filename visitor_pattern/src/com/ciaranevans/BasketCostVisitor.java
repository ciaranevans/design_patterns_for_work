package com.ciaranevans;

import com.ciaranevans.products.Bread;
import com.ciaranevans.products.Fruit;
import com.ciaranevans.products.Vegetable;

public class BasketCostVisitor implements Visitor {

    private double totalCost = 0;

    @Override
    public void visit(final Fruit fruit) {
        totalCost += fruit.getPrice();
    }

    @Override
    public void visit(final Vegetable vegetable) {
        totalCost += vegetable.getPrice();
    }

    @Override
    public void visit(final Bread bread) {
        totalCost += bread.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }
}
