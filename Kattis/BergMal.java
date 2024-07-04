import java.util.Scanner;

//BergMál
public class BergMal {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            try 
            {
                System.out.println(sc.nextLine());
            }
            catch (Exception e)
            {
                System.out.println(sc.nextFloat());
            }
        }
        
    }
}

