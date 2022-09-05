package Classes.Encapsulation;

import Classes.Encapsulation.EnhancedPlayer.EnhancedPlayer;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "TIM";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining helath = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Tim", 50, "sword");
        System.out.println("Initial health is " + player1.getHealth());

        EnhancedPlayer player2 = new EnhancedPlayer("Tim2", 200, "axe");
    }
}
