package Exercises.Exercise39Polymorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate(){
        return  getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake(){
        return  getClass().getSimpleName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}
