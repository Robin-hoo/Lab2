package Hust;

import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> itemsOrdered;
    private int qtyOrdered;

    public Cart() {
        itemsOrdered = new ArrayList<>();
        qtyOrdered = 0;
    }

    // Add DVD to Cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            itemsOrdered.add(disc);
            qtyOrdered++;
        } else {
            System.out.println("Cannot add more than 20 DVDs.");
        }
    }

    // Remove DVD from Cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.contains(disc)) {
            itemsOrdered.remove(disc);
            qtyOrdered--;
        } else {
            System.out.println("The DVD is not in the cart.");
        }
    }

    // Calculate total cost
    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

    // Display items in the cart
    public void displayCart() {
        for (DigitalVideoDisc disc : itemsOrdered) {
            System.out.println(disc.getTitle() + " | " + disc.getCost());
        }
    }
}
