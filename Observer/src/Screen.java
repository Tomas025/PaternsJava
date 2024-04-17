import java.util.List;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
        this.model.addObserver(new ObserverNumber(this));
        this.model.addObserver(new ObserverMaxNumbers(this));
    }

    public void print(int newDigit) {
        System.out.println("Pressionando: " + newDigit);
        System.out.println(newDigit);
    }

    public void print(List<Integer> digits, int newDigit) {
        System.out.print("Agora discando ");
        for(Integer digit : digits) {
            System.out.print(digit.toString());
        }
        System.out.print("...");
    }
}
