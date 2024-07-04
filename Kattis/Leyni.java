import java.util.Scanner;

// Leyniþjónusta
public class Leyni {
    public static void main(String[] args) {
                
        try (Scanner input = new Scanner(System.in))
        {
            System.out.println(input.nextLine().replaceAll("\\s", ""));
        }
        
    }
}
