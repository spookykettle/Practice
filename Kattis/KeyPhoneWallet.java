// Keys, Phone, Wallet

import java.util.*;

public class KeyPhoneWallet {
    static Scanner inputt = new Scanner(System.in);
    public static void main(String[] args) {
        int things = inputt.nextInt();
        List<String> mustHave = Arrays.asList("keys", "phone", "wallet");
        List<String> missing = new ArrayList<>();
        Set<String> grabbed = new HashSet<>();
    
        for(int x = 0; x <= things; x++){
            grabbed.add(inputt.nextLine());
        }

        for (String item : mustHave){
            if(!grabbed.contains(item)){
                missing.add(item);
            }
        }

        if (missing.isEmpty()){
            System.out.println("ready");
        }
        else {
            for (String item : missing){
                System.out.println(item);
            }
        }

    }
}
