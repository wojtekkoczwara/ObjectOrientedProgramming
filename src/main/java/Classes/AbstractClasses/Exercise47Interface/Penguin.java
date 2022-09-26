package Classes.AbstractClasses.Exercise47Interface;

public class Penguin extends Bird{
    @Override
    public void fly() {
        System.out.println("I'm not very good at that, canI go swim instead?");
    }

    public Penguin(String name) {
        super(name);
    }
}
