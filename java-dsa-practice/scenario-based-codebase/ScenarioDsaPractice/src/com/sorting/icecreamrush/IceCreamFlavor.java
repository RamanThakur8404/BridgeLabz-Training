package com.sorting.icecreamrush;
public class IceCreamFlavor {
    private String flavorName;
    private int sales;

    public IceCreamFlavor(String flavorName, int sales) {
        this.flavorName = flavorName;
        this.sales = sales;
    }

    public String getFlavorName() {
        return "Ice Cream Flavor: " + flavorName;
    }

    public int getSales() {
        return sales;
    }

}
