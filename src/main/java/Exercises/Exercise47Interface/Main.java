package Exercises.Exercise47Interface;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Wojtaz", 100, 20);
        System.out.println(player.toString());
        Monster monster =  new Monster("Premier", 69, 100);
        System.out.println(monster.toString());
    }
}
