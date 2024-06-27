import java.util.Scanner;

public class Fifa {
    //Framtíðar FIFA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2022 + number of improvements since you were frozen / number of improvements the game receives every year
        System.out.println(2022 + (sc.nextInt()/sc.nextInt()));
    }
}
