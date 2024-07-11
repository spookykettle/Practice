// Autori

import java.util.Scanner;

public class Autori 
{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) 
        {
            String inputText = input.nextLine();

            String[] textArray = inputText.split("-");

            for(String each:textArray)
            {
                System.out.print(each.charAt(0));
            }
            System.out.println(); // to get rid of %
        }

    }
}
