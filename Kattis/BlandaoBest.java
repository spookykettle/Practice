//Blandað Best

import java.util.Scanner;

public class BlandaoBest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // the number of meat types KFFÍ is offering today.
        @SuppressWarnings("unused") // because we don't actually use dummy varaible. The wiggly line under bothered me.
        String dummy = input.nextLine(); // This is to clear input buffer

        String[] food = new String[n];
        String foodmix = "";

        for (int i = 0; i < n; i++)
        { 
            food[i] = input.nextLine();
            
            // use .equals when comparing object from Class string 
            if (food[i].equals("kjuklingur"))
            {
                foodmix += "g";
            }
            else if(food[i].equals("nautakjot"))
            {
                foodmix += "j";
            }
        }

        if (foodmix.contains("g") && foodmix.contains("j"))
        {
            System.out.println("blandad best");
        }
        else
        {
            System.out.println(food[0]);
        }
        
    }
}
