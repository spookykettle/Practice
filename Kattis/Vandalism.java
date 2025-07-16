// Vandalism

import java.util.Scanner;

public class Vandalism {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);

        String uapcInput = inputt.nextLine();
        String output = "";
        if (!uapcInput.contains("U")) output += "U";
        if (!uapcInput.contains("A")) output += "A";
        if (!uapcInput.contains("P")) output += "P";
        if (!uapcInput.contains("C")) output += "C";
        
        System.out.println(output);
        inputt.close();
    }
}
