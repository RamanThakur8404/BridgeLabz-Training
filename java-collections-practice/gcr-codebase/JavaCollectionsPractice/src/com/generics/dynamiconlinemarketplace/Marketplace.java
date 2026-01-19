package com.generics.dynamiconlinemarketplace;
class Marketplace {
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        double newPrice = product.getPrice() - discountAmount;
        product.setPrice(newPrice);
        System.out.println("Discount applied to " + product.getName() + ".\nNew Price: " + newPrice);
    }
}
