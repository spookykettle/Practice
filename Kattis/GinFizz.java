// Gin Fizz

import java.util.Scanner;

public class GinFizz {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);

        int ginNum = inputt.nextInt();
        String slice = "slice";
        if (ginNum > 1) slice = "slices";
        System.out.println(45  *ginNum + " ml gin\n" + 
                           30 * ginNum + " ml fresh lemon juice\n" +
                           10 * ginNum + " ml simple syrup\n" + 
                           1 * ginNum  + " " +  slice + " of lemon");

        inputt.close();
    }
}
