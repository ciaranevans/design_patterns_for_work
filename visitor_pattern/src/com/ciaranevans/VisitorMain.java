package com.ciaranevans;

import com.ciaranevans.products.Apple;
import com.ciaranevans.products.Cauliflower;
import com.ciaranevans.products.FrenchStick;

import java.util.Arrays;
import java.util.List;

public class VisitorMain {
    public static void main(final String[] args) {
        final List<Visitable> shoppingCart = Arrays.asList(
                new FrenchStick(),
                new FrenchStick(),
                new Apple(),
                new Apple(),
                new Apple(),
                new Cauliflower()
        );

        final BasketCostVisitor basketCostVisitor = new BasketCostVisitor();

        shoppingCart.forEach(visitable -> visitable.accept(basketCostVisitor));

        System.out.println("Total price of basket is: " + basketCostVisitor.getTotalCost());
    }
}
