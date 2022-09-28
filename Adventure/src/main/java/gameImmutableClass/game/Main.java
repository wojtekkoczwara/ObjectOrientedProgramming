package gameImmutableClass.game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static game.Location.containsDirection;
import static game.Location.convertDirection;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of computer learning java", tempExit));




        tempExit.put("W", 2);

        tempExit = new HashMap<>();
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end pf the road before a small bridge", tempExit));
//        tempExit.put("Q",0);

        tempExit = new HashMap<>();
        tempExit.put("N",5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));
//        tempExit.put("Q",0);

        tempExit = new HashMap<>();
        tempExit.put("W",1);
        locations.put(3, new Location(3, "You are inside a building", tempExit));
//        tempExit.put("Q",0);

        tempExit = new HashMap<>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        locations.put(4, new Location(4, "You are in a valley besde a stream", tempExit));

//        tempExit.put("Q",0);

        tempExit = new HashMap<>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));

//        tempExit.put("Q",0);



        int loc = 1;
        while (true){
            if(loc == 0){
                break;
            }
            System.out.println(locations.get(loc).getDescription());
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit.toUpperCase() + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            if (containsDirection(direction)) {
                direction = convertDirection(direction);
            }
            if(exits.containsKey(direction.toUpperCase())){
                loc = exits.get(direction.toUpperCase());
            } else {
                System.out.println("You cannot go in that direction");
            }
//            loc = scanner.nextInt();
//            if(!locations.containsKey(loc)){
//                System.out.println("can't go that direction");
//            }
        }
    }
}
