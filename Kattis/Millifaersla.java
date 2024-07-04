import java.util.Scanner;

public class Millifaersla {
// Millifærsla
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in))
        {
            int m = input.nextInt();
            int f = input.nextInt();
            int d = input.nextInt();

            if (m < f && m < d) System.out.println("Monnei");
            else if (f < m && f<d) System.out.println("Fjee");
            else if (d < m && d<f) System.out.println("Dolladollabilljoll");
        }
    }
}
