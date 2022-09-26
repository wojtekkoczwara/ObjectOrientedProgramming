package Generics.Challenge;

import Generics.Player;
import Generics.Team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class League<U extends Player, T extends Team> {
    private final ArrayList<T> rankedList;
    private String name;
    public League( String name) {
        this.name = name;
        this.rankedList = new ArrayList<>() {
        };
    }

    public void addTeam(T team){
        this.rankedList.add(team);
        sortRankedList();
    }

    public void printTeams(){
        for (T team : this.rankedList){
            System.out.println(team.getName() + " " + team.getRanking());
        }
    }


    private void sortRankedList(){
        Collections.sort(this.rankedList);
    }


}
