// Sibice
import java.util.Scanner;

public class Sibice {
    static Scanner inputt = new Scanner(System.in);
    public static void main(String[] args) {
        
        String[] firstLine = inputt.nextLine().split(" ");
        int numMatches = Integer.parseInt(firstLine[0]);
        int width = Integer.parseInt(firstLine[1]);
        int height = Integer.parseInt(firstLine[2]);

        // c^2 = a^2 + b^2 -- Diagonal being  longest possible -- Math.pow((width*width+height*height), 0.5)

        for (int num = 0; num < numMatches; num++){
            if (inputt.nextInt() <= (float)Math.pow((width*width+height*height), 0.5)){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }
        }
        

    }
}
