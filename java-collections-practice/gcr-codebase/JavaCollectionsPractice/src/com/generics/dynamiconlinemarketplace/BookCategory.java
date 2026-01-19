package com.generics.dynamiconlinemarketplace;
// 2. BookCategory class
class BookCategory extends ProductCategory {
    public BookCategory() {
        super("Book");
    }
}

// 3. ClothingCategory class
class ClothingCategory extends ProductCategory {
    public ClothingCategory() {
        super("Clothing");
    }
}

// 4. GadgetsCategory class
class GadgetsCategory extends ProductCategory {
    public GadgetsCategory() {
        super("Gadget");
    }
}
