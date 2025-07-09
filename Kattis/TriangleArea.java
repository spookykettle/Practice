// Triangle Area
// 0.5*h*b

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        String[] inputInt = input.nextLine().split(" ");

        System.out.println(Integer.valueOf(inputInt[0]) * Integer.valueOf(inputInt[1]) * 0.5);
        
        input.close();
    }
}
