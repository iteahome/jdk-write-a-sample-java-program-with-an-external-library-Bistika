import org.joda.time.DateTime;
import org.joda.time.Duration;

public class main {

    public static void main(final String[] args) {
        final DateTime now = DateTime.now();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        final DateTime other = DateTime.now();
        final Duration duration = new Duration(now, other);
        System.out.println(duration);
        System.out.println("Short difference of time, just to demonstrate.");
    }
}