// Fimmtudagstilboð
import java.util.Scanner;

public class Fimmtudagstilbod {
    public static void main(String[] args) {
        Scanner inputLine = new Scanner(System.in);

        int year = inputLine.nextInt();
        if (year <= 2020){
            System.out.println(1000);
        }
        else if (year >= 2021){
            System.out.println(1000 + (year-2020)*100);
        }
        
        inputLine.close();
    }
}
