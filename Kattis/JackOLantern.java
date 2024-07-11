import java.util.Scanner;

// Jack-O'-Lantern Juxtaposition
public class JackOLantern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String inputInt = input.nextLine();
        String[] numArray = inputInt.split(" ");

        System.out.println(Integer.parseInt(numArray[0])*Integer.parseInt(numArray[1])*Integer.parseInt(numArray[2]));
        
        input.close();
    }
}
