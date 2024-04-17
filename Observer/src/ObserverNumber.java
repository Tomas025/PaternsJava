public class ObserverNumber implements Observer {
    private Screen screen;

    public ObserverNumber(Screen s) {
        this.screen = s;
    }

    @Override
    public void update(int newDigit) {
        screen.print(newDigit);
    }
    
}
