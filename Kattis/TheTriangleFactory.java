// The Triangle Factory
import java.util.Scanner;

public class TheTriangleFactory {
    public static void main(String[] args) {
        Scanner inputAngle = new Scanner(System.in);

        int firstAngle = inputAngle.nextInt();
        int secAngle = inputAngle.nextInt();
        int thirdAngle = inputAngle.nextInt();

        if (firstAngle == 90 || secAngle == 90 || thirdAngle == 90){
            System.out.println("Ratvinklig Triangel");
        }
        else if(firstAngle < 90 && secAngle < 90 && thirdAngle < 90){
            System.out.println("Spetsig Triangel");
        }
        else if(firstAngle > 90 || secAngle > 90 || thirdAngle > 90){
            System.out.println("Trubbig Triangel");
        }

        inputAngle.close();
    }


}
