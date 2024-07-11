import java.util.*;

// Betting
public class Betting {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        double num = x.nextInt();

        System.out.println(100 / num);
        System.out.println(100 / (100.0 - num));

        x.close();
    }
}
