import java.util.Scanner;

// Blaðra
public class Blaora {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in))
        {
            String inputValue = input.nextLine();
            String[] num = inputValue.split(" ");

            int v = Integer.parseInt(String.valueOf(num[0]));
            int a = Integer.parseInt(String.valueOf(num[1]));
            int t = Integer.parseInt(String.valueOf(num[2]));

            double d = (v*t) + ((0.5*a)*(t*t));
            System.out.printf("%.9f", d);
            
        }
    }
}
