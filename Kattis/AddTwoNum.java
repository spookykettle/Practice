import java.util.Scanner;

// Add Two Numbers, Two-sum
public class AddTwoNum {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String num[]= x.nextLine().split(" "); // this could be more than two num

        System.out.println(Integer.parseInt(num[0])+Integer.parseInt(num[1])); // add index 0 and 1 together

        x.close();
    }
}
