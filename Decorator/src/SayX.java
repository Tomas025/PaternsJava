public class SayX extends CakeDecorator {
    private String message;

    public SayX(Cake cake, String x) {
        this.cake = cake;
        this.message = x;
    }

    @Override
    public int getCost() {
        return this.cake.getCost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying " + '"' + this.message + '"';
    }
}
