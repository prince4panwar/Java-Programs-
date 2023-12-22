//Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
class Product {
    private String name;
    private int quantity;

    // Constructor
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Method to increase product quantity
    public void increaseQuantity(int amount) {
        quantity += amount;
        System.out.println("Added " + amount + " " + name + "(s) to inventory. Total quantity: " + quantity);
    }

    // Method to decrease product quantity
    public void decreaseQuantity(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
            System.out.println("Removed " + amount + " " + name + "(s) from inventory. Total quantity: " + quantity);
        } else {
            System.out.println("Insufficient " + name + "(s) in inventory.");
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Inventory {
    private Product[] products;
    private int numProducts;

    // Constructor
    public Inventory(int maxProducts) {
        products = new Product[maxProducts];
        numProducts = 0;
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        if (numProducts < products.length) {
            products[numProducts] = product;
            numProducts++;
            System.out.println("Product added to inventory: " + product.getName());
        } else {
            System.out.println("Cannot add more products. Inventory is full.");
        }
    }

    // Method to remove a product from the inventory
    public void removeProduct(String productName) {
        boolean found = false;
        for (int i = 0; i < numProducts; i++) {
            if (products[i].getName().equalsIgnoreCase(productName)) {
                found = true;
                System.out.println("Product removed from inventory: " + products[i].getName());
                for (int j = i; j < numProducts - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[numProducts - 1] = null;
                numProducts--;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found in inventory: " + productName);
        }
    }

    // Method to check for low inventory
    public void checkLowInventory(int threshold) {
        System.out.println("Products with low inventory:");
        for (int i = 0; i < numProducts; i++) {
            if (products[i].getQuantity() < threshold) {
                System.out.println("- " + products[i].getName() + ": " + products[i].getQuantity());
            }
        }
    }
}

public class pro13 {
    public static void main(String[] args) {
        // Creating an Inventory instance
        Inventory inventory = new Inventory(5); // Assuming maximum 5 products in the inventory

        // Adding products to the inventory
        Product product1 = new Product("Laptop", 10);
        Product product2 = new Product("Phone", 5);
        Product product3 = new Product("Tablet", 3);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Removing a product from the inventory
        inventory.removeProduct("Phone");

        // Checking for low inventory (threshold set to 5)
        inventory.checkLowInventory(5);
    }
}
