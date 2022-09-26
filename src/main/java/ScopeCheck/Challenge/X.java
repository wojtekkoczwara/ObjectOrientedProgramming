package ScopeCheck.Challenge;

import java.util.Scanner;

public class X {
    private int x;

    public void provideX(){
        Scanner x = new Scanner(System.in);
        this.x = x.nextInt();
    }

    public void printXTimeTable(){
        provideX();
        for (int x = 1; x < this.x; x++) {
            System.out.println(this.x + " times " + x + " equals " + this.x*x);
        }
    }

}
