// Heysáta

import java.util.Scanner;

public class Heysata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputHayNum = input.nextInt();
        String buffer = input.nextLine();
        String inputNeedle = input.nextLine();
        String[] inputHay = input.nextLine().split("");

        boolean hasFound = false;
        
        for (String hay : inputHay){
            if (hay.equals(inputNeedle) || hay == inputNeedle){
                hasFound = true;
            }
        }

        if (hasFound == true) System.out.println("Unnar fann hana!");
        else System.out.println("Unnar fann hana ekki!");

        
        input.close();
    }
}
