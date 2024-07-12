import java.util.Scanner;

// Metronome
public class Metronome {
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        int input = x.nextInt();

        System.out.println(input/4.0);

        x.close();
        
    }
}
