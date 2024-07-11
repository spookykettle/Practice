import java.util.Scanner;

// Á leið í bíó
public class Aleioibio {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // the number of minutes it takes to drive from Hannes to Arnar.
        int b = input.nextInt(); // the number of minutes it takes to drive from Arnar to the cinema.
        int c = input.nextInt(); // the minute of the day, on which the film is scheduled to start.

        System.out.println(c-a-b);

        input.close();
        
    }
}
