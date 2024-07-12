import java.util.Scanner;

// Hraðgreining
public class Hradgreining {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);

        String input = o.nextLine();

        if (input.contains("COV")) System.out.println("Veikur!");
        else System.out.println("Ekki veikur!");

        o.close();
    }
}
