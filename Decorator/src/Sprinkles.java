public class Sprinkles extends CakeDecorator {

    public Sprinkles(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return this.cake.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }
    
}
