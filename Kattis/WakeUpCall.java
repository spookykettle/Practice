// Wake up call
import java.util.Scanner;

public class WakeUpCall {
    static Scanner inputt = new Scanner(System.in);
    public static void main(String[] args) {

        String[] firstLine = inputt.nextLine().split(" ");
        int first = Integer.parseInt(firstLine[0]);
        int second = Integer.parseInt(firstLine[1]);
        int sum1 = 0;
        int sum2 = 0;

        String[] secondLine = inputt.nextLine().split(" ");
        for (int x = 0; x < first; x++){
            sum1 += Integer.parseInt(secondLine[x]);
        }

        String[] thirdLine = inputt.nextLine().split(" ");
        for (int x = 0; x < second; x++){
            sum2 += Integer.parseInt(thirdLine[x]);
        }

        if (sum1 > sum2){
            System.out.println("Button 1");
        }
        else if (sum1 < sum2){
            System.out.println("Button 2");
        }
        else{
            System.out.println("Oh no");
        }

    }
    
}