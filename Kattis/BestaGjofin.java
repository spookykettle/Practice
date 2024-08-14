import java.util.*;

public class BestaGjofin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num_input = input.nextInt();
        @SuppressWarnings("unused")
        String buffer = input.nextLine();
        int max = 0;
        String output = "";

        for (int i = 0; i < num_input; i++)
        {

            String yum = input.nextLine();
            String[] splited = yum.split("\\s+");
            try
            {
                if (Integer.parseInt(splited[1]) >= max) 
                {
                    max = Integer.parseInt(splited[1]);
                    output = splited[0];
                }
            }
            catch (Exception e)
            {
                System.out.println("wy");
            }
        
        }

        System.out.println(output);
        input.close();

    }


    
}
