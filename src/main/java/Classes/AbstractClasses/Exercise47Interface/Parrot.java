package Classes.AbstractClasses.Exercise47Interface;

public class Parrot extends Bird{
    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }

    public Parrot(String name) {
        super(name);
    }
}
