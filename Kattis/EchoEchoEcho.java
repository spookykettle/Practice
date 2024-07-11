// Echo Echo Echo
import java.util.Scanner;

public class EchoEchoEcho {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        String inputText = x.nextLine();
        for (int i = 0; i < 3; i++)
        {
            System.out.print(inputText);
            if (i < 2) System.out.print(" ");
        }

        System.out.println(); // remove %

        x.close();
    }
}
