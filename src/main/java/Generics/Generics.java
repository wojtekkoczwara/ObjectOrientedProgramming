package Generics;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
//        items.add("Wojtek");


        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("Bekcham");

        Team<FootballPlayer> adelaideCrows = new Team<FootballPlayer>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team <BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<SoccerPlayer>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<FootballPlayer>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<FootballPlayer>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<FootballPlayer>("Fremantle");

        hawthorn.matchResult(fremantle, 1,0);
        hawthorn.matchResult(adelaideCrows, 3,8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);
        System.out.println("rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(adelaideCrows.compareTo(fremantle));
        System.out.println(hawthorn.compareTo(adelaideCrows));

        ArrayList<Team> teams = null;
        Collections.sort(teams);

    }

    public static void printDoubled(ArrayList<Integer> n){
        for (int i : n){
            System.out.println( i * 2);
        }
    }

}
