package Exercises.Exercise31WallArea;

import Exercises.Exercise33CarpetCostCalculator.Floor;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
       return floor.getArea() * carpet.getCost();
    }
}
