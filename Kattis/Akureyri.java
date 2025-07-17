// Akureyri

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Akureyri {
    static Scanner inputt = new Scanner(System.in);
    public static void main(String[] args) {

        int line = inputt.nextInt();
        String dummy = inputt.nextLine();
        ArrayList<String> locations = new ArrayList<>();

        for (int i = 0; i < line; i++){
            String contestant = inputt.nextLine();
            String location = inputt.nextLine();
            
            locations.add(location);
        }
        countOccurence(locations);
        
    }

    /**
     * store the frequency of element
     * @param list of locations
     */
    public static void countOccurence(ArrayList<String> list){
        Map<String, Integer> locationAndCount = new HashMap<String, Integer>();

        for(String place : list){
            Integer count = locationAndCount.get(place); // For each string i in the list: checks if the element is already in the map: If it's not (j == null)
            locationAndCount.put(place, (count == null) ? 1 : count + 1); // (condition) ? value_if_true : value_if_false;
        }

        //display
        for (Map.Entry<String, Integer> each : locationAndCount.entrySet()) {
            System.out.println(each.getKey() + " " + each.getValue());
        }
    }
    

}
