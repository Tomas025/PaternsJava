import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel implements Subject{
    private List<Integer> digits = new ArrayList<>();
    private List<Observer> observers = new ArrayList<Observer>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObserver(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver(int newDigit) {
        for(Observer observer : observers) {
            observer.update(newDigit);
        }
    }
}
