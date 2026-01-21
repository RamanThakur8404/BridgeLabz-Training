package com.smartcheckout;
import java.util.List;

class Customer {
    String name;
    List<String> items; // list of item names

    Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}
