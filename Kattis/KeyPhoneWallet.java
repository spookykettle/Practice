// Keys, Phone, Wallet

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPhoneWallet {
    static Scanner inputt = new Scanner(System.in);
    public static void main(String[] args) {
        int things = inputt.nextInt();
        ArrayList<String> grabbed = new ArrayList<>();

        for(int x = 0; x <= things; x++){
            String each = inputt.nextLine();
            grabbed.add(each);
        }

        if (!grabbed.contains("keys")){
            System.out.println("keys");
        }
        if (!grabbed.contains("phone")){
            System.out.println("phone");
        }
        if (!grabbed.contains("wallet")){
            System.out.println("wallet");
        }
        if (grabbed.contains("keys") && grabbed.contains("wallet") && grabbed.contains("phone")){
            System.out.println("ready");
        }



    }
}
