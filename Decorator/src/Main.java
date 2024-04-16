/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create cakes
        Cake chocolateCake = new ChocolateCake();

        Cake vanillaCake = new VanillaCake();
        vanillaCake = new SayX(vanillaCake, "PLAIN!");

        Cake vanillaCake2 = new VanillaCake();
        vanillaCake2 = new Sprinkles(vanillaCake2);
        vanillaCake2 = new SayX(vanillaCake2, "FANCY!");

        Cake strawberryCake = new StrawberryCake();
        strawberryCake = new Layer(strawberryCake);
        strawberryCake = new Sprinkles(strawberryCake);
        strawberryCake = new Sprinkles(strawberryCake);
        strawberryCake = new SayX(strawberryCake, "One of");
        strawberryCake = new SayX(strawberryCake, "EVERYTHING!");

        // Create the order
        Order order = new Order();
        order.addCake(chocolateCake);
        order.addCake(vanillaCake);
        order.addCake(vanillaCake2);
        order.addCake(strawberryCake);

        // Print the order
        order.printOrder();
    }
}
