import java.util.Scanner;

// Quadrant Selection

public class QuadrantSelection {
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) 
        {
            int x = input.nextInt();
            int y = input.nextInt();
            int output = 0;

            if (x > 0 && y > 0) output = 1;
            else if (x < 0 && y > 0) output = 2;
            else if (x < 0 && y < 0) output = 3;
            else if (x > 0 && y < 0) output = 4;

            System.out.println(output);
        }
    }
}
