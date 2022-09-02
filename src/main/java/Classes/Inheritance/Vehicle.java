package Classes.Inheritance;

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println("I am moving with speed" + this.speed);
    }

    public void increaseSpeed(int speed){
        this.speed += speed;
    }

    public void decreaseSpeed(int speed){
        this.speed -= speed;
    }

}
