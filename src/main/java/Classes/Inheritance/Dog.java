package Classes.Inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;



    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }


    public Dog(String name,  int size, int weight) {
        super(name, 1, 1, size, weight);
    }

    private void chew(){
        System.out.println("chewing ciam ciam");
    }

    @Override
    public void eat() {
        super.eat();
        chew();
    }

    public void walk(){
        System.out.println("Walking dog tup tup tup tup");
    }

    public void move(){
        super.move(10);
        walk();
    }
}
