import java.util.Scanner;

//Takk fyrir mig
public class TakkFyrirMig {
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in))
        {
            int numberOfNames = input.nextInt();
            String dummy = input.nextLine(); // put dummy here because when enter numberOfNames above, it also enter the next inpurt at the same time.
            String[] inputName = new String[numberOfNames];
            
            for(int i = 0; i < numberOfNames; i++)
            {
                inputName[i] = input.nextLine();
            }

            for (String string:inputName)
            {
                System.out.println("Takk " + string);
            }
            
        }
    }
}
