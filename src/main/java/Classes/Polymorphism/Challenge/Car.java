package Classes.Polymorphism.Challenge;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    private int speed;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void startEngine(){
        this.engine = true;
    }

    public void stopEngine(){
        this.engine = false;
    }

    public void accelerate(int speed){
        if(speed > 0){
            this.speed += speed;
        } else {
            System.out.println("provide correct speed");
        }
    }

    public void brake(int speed){
        if(speed > 0){
            this.speed -= speed;
        } else {
            System.out.println("provide correct speed");
        }
    }

    public String getEngineSound(){
        return "Engine sounds normally";
    }

}

class Ferrari extends Car{
    public Ferrari(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String getEngineSound() {
        return "Engine sounds like a Ferrari";
    }
}

class Jeep extends Car{
    public Jeep(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String getEngineSound() {
        return "Engine sounds like a Jeep " + getClass().getCanonicalName();
    }
}

class Main{

    public static void main(String[] args) {
       Ferrari ferrari = new Ferrari( 8, "testarossa");
       ferrari.getEngineSound();

       Jeep jeep = new Jeep(12, "wrangler");
    }
}
