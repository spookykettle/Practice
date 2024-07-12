import java.util.Scanner;

// Knight Packing
public class KnightPacking {
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        int input = x.nextInt();

        if (input%2==1) System.out.println("first");
        else System.out.println("second");

        x.close();
        
    }
}
