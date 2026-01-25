package com.binarysearchtree.productinventory;
class InventoryBST {

    Node root;

    public void insert(Product product) {
        root = insertRec(root, product);
    }

    private Node insertRec(Node root, Product product) {
        if (root == null) {
            return new Node(product);
        }

        if (product.sku < root.product.sku)
            root.left = insertRec(root.left, product);
        else if (product.sku > root.product.sku)
            root.right = insertRec(root.right, product);

        return root;
    }

    public Product search(int sku) {
        Node node = searchRec(root, sku);
        return node != null ? node.product : null;
    }

    private Node searchRec(Node root, int sku) {
        if (root == null || root.product.sku == sku)
            return root;

        if (sku < root.product.sku)
            return searchRec(root.left, sku);

        return searchRec(root.right, sku);
    }

    public void updatePrice(int sku, double newPrice) {
        Product p = search(sku);
        if (p != null) {
            p.price = newPrice;
        }
    }

    public void displaySorted() {
        inorder(root);
    }

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.product);
            inorder(root.right);
        }
    }
}
