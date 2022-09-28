package gameImmutableClass.game;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;

    private final Map<String, Integer>  exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        //this one + plus in declaration makes class immutable
        if (exits != null) {
            this.exits = new HashMap<>(exits);
        }else {
            this.exits = new HashMap<>();
        }
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location){
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

    public static boolean containsDirection(String direction){
        if(direction.contains("West".toUpperCase()) || direction.contains("East".toUpperCase()) || direction.contains("South".toUpperCase()) || direction.contains("North".toUpperCase())){
            return true;
        }
        return false;
    }

    public static String convertDirection(String direction) {
        String[] directionArray = direction.split(" ");
        for (String s : directionArray) {
            if (s.contains("WEST") || s.contains("EAST")
                    || s.contains("SOUTH")
                    || s.contains("NORTH")) {
                direction = s.toLowerCase();
            }
        }
        switch (direction){
            case "west":
                return "W";
            case "east":
                return "E";
            case "north":
                return "N";
            case "south":
                return "S";
            default:
                return "Wrong direction, direction doesn't exist";
        }
    }
}
