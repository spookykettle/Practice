import java.util.Arrays;
import java.util.Scanner;

// Barcelona
public class Barcelona 
{
    public static void main(String[] args) 
    {
        Scanner p = new Scanner(System.in);

        String num[]= p.nextLine().split(" "); // two integers and , the number of bags and Benni’s bag.
        String num2[]= p.nextLine().split(" "); // integers separated by spaces. No two bags are given by the same number and Benni’s bag always appears in the list.

        // check if at first or second, else print the index+1 of where the num[1] is
        if (Arrays.asList(num2).indexOf(num[1]) == 0)
        {
            System.out.println("fyrst");
        }
        else if (Arrays.asList(num2).indexOf(num[1]) == 1)
        {
            System.out.println("naestfyrst");
        }
        else 
        {
            for (String each:num2)
            {
                if (Integer.parseInt(num[1]) == Integer.parseInt(each)) System.out.println(Arrays.asList(num2).indexOf(num[1])+1 + " fyrst");
            }
        }

        p.close();
    }

}
