import java.util.Scanner;

//Viðsnúningur
public class Viosnuningur
{
    public static void main(String[] args) {
        // get input string
        try (Scanner input = new Scanner(System.in)) 
        {
            String inputString = input.nextLine();
            String reversedString = "";

            // start from the last and add to reversedString
            for (int i = inputString.length()-1; i >= 0; i--)
            {
                reversedString += inputString.charAt(i);
            }

            System.out.println(reversedString);
        }
    }
}
