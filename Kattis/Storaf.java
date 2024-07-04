import java.util.Scanner;

public class Storaf {

//Stórafmæli
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) 
        {
            int inputYear = input.nextInt();
            if (inputYear % 10 == 0) System.out.println("Jebb");
            else System.out.println("Neibb");
        }
    }
}
