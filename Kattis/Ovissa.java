import java.util.Scanner;

public class Ovissa {
     public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            try 
            {
                System.out.println(sc.nextLine().length());
            }
            catch (Exception e)
            {
                System.out.println(Integer.toString(sc.nextInt()).length());
            }
        }
        
    }
}
