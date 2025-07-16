// Monopoly

import java.util.ArrayList;
import java.util.Scanner;

// The first input consists of an integer N (1 <= N <= 11) -- the number of hotels the opponents own.
// The second input consists of integers (2 <= A1 < .. <= 2) -- the eachtances to each of the opponents’ N hotels.

// Output - decimal

public class Monopoly {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        ArrayList<Integer> combinations = new ArrayList<>();
        for (int die1 = 1; die1 <= 6; die1++) {
            for (int die2 = 1; die2 <= 6; die2++) {

                combinations.add(die1+die2);
            }
        }

        int inputHotel = input.nextInt();
        String buffer = input.nextLine();
        String[] inputDistance = input.nextLine().split(" ");

        int count = 0;

        for (String eachHotel : inputDistance){
            for (int eachSum : combinations){
                if (Integer.parseInt(eachHotel) == eachSum){
                    count++;
                }
            }
        }

        System.out.println((count+0.0)/36.00 + 0.0000);        
    }
}
