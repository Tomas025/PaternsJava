import java.util.ArrayList;
import java.util.List;

public class ObserverMaxNumbers implements Observer {
    private List<Integer> digits = new ArrayList<Integer>();
    private Screen screen;

    public ObserverMaxNumbers(Screen s) {
        this.screen = s;
    }

    @Override
    public void update(int newDigit) {
        digits.add(newDigit);
        if(digits.size() >= 12) {
            screen.print(digits, newDigit);
        }
    }
    
}
