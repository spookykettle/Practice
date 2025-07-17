// Minesweeper -- Runtime error

import java.util.ArrayList;
import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);

        // Geting input; n = row, m = column, k = number of pairs the hack printed
        String[] mapString = inputt.nextLine().split(" ");
        ArrayList<Integer> mapInt = new ArrayList<>();
        mapInt.add(Integer.parseInt(mapString[0]));
        mapInt.add(Integer.parseInt(mapString[1]));
        mapInt.add(Integer.parseInt(mapString[2]));
        
        // input board
        ArrayList<ArrayList<Object>> board = new ArrayList<>(){
            private static final long serialVersionUID = 1L;
        };
        for (int line = 0; line < (Integer)mapInt.get(2); line++){
            String[] rowStirng = inputt.nextLine().split(" ");
            ArrayList<Object> rowInt = new ArrayList<>();
            rowInt.add(Integer.parseInt(rowStirng[0]));
            rowInt.add(Integer.parseInt(rowStirng[1]));
            board.add(rowInt);
        }

        // board possibilities
        ArrayList<ArrayList<Object>> map = new ArrayList<>(){
            private static final long serialVersionUID = 1L;
        };
        for (int row = 1; row <= (Integer)mapInt.get(0); row++){
            for (int column = 1; column <= (Integer)mapInt.get(1); column++){
                ArrayList<Object> mapEach = new ArrayList<>();
                mapEach.add(row);
                mapEach.add(column);
                map.add(mapEach);
            }
        }

        ArrayList<ArrayList<Object>> dot = new ArrayList<>(map);
        ArrayList<ArrayList<Object>> asterisk = new ArrayList<>(board);
        
        // // Show the "before" lists
        // System.out.println("First List: " + asterisk);
        // System.out.println("Second List: " + dot);

        // // Remove all elements in firstList from secondList
        dot.removeAll(asterisk);

        // // Show the "after" list. - Dot
        // System.out.println("Result: " + dot);   

        ArrayList<ArrayList<Object>> dot2 = dot;


        for (ArrayList<Object> each : dot){
            if (map.contains(each)){
                for(ArrayList<Object> eachMap : map){
                    if (eachMap.equals(each)){
                        each.set(0, ".");
                    }
                }
            }
        }

        for (ArrayList<Object> eachMap : map){
            if (eachMap.get(0) != "."){
                eachMap.set(0, "*");
            }
        }

        int count = 0;
        for (ArrayList<Object> each : map) {
            System.out.print(each.get(0));
            count++;
            if (count%mapInt.get(1) == 0){
                System.out.println();
            }
        }
      
       
        inputt.close();
    }
}
