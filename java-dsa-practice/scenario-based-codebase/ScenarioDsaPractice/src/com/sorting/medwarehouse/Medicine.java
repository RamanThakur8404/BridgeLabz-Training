package com.sorting.medwarehouse;
class Medicine {

    private String name;
    private int expiryDays;

    public Medicine(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (Expires in " + expiryDays + " days)";
    }
}
