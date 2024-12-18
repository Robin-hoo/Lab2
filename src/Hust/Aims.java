package Hust;
public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 20.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 15.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Toy Story", "Animation", "John Lasseter", 81, 10.99f);

        // Add DVDs to the cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Display the cart
        System.out.println("Cart contents:");
        cart.displayCart();

        // Calculate total cost
        System.out.println("Total cost: " + cart.totalCost());

        // Remove a DVD
        cart.removeDigitalVideoDisc(dvd2);

        // Display the cart after removal
        System.out.println("Cart after removing a DVD:");
        cart.displayCart();
    }
}
