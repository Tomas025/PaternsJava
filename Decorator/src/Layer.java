public class Layer extends CakeDecorator {

    public Layer(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return this.cake.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + cake.getDescription();
    }
    
}
