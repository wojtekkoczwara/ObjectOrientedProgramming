package Generics.Challenge;

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

import Generics.BaseballPlayer;
import Generics.FootballPlayer;

public class Main {

    public static void main(String[] args) {
        BeaseballTeam olawa = new BeaseballTeam("olawianie");
        BeaseballTeam strzelin = new BeaseballTeam("strzelinianie");
        BeaseballTeam ladek = new BeaseballTeam("ladeczczanie");
        FootballTeam wroclaw = new FootballTeam("slask");

        olawa.setRanking(20);
        strzelin.setRanking(10);
        ladek.setRanking(77);
        wroclaw.setRanking(72);

        League<BaseballPlayer, BeaseballTeam> league = new League<>("bezbolisci");
        league.addTeam(olawa);
        league.addTeam(strzelin);
        league.addTeam(ladek);
//        league.addTeam(wroclaw);

        league.printTeams();
    }

}
