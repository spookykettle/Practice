import java.util.Scanner;

public class Reduplication {
    
    //Reduplication
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) 
        {
            String inputWord = sc.nextLine();
            int repeat = sc.nextInt();

            for (int i = 0; i < repeat; i++)
            {
                System.out.print(inputWord);
            }
        }
        
       
    }
}
