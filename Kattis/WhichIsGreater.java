import java.util.Scanner;

// Which is Greater?
public class WhichIsGreater {
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        String inputNum = x.nextLine();
        String[] num = inputNum.split(" ");

        // if a > b
        if (Integer.parseInt(num[0]) > Integer.parseInt(num[1]))
        {
            System.out.println(1);
        }

        // a <= b
        else if (Integer.parseInt(num[0]) <= Integer.parseInt(num[1]))
        {
            System.out.println(0);
        }

        x.close();
    }
}
