package Classes.Inheritance;

public class Car extends Vehicle{

    public int gearNo;
    public String steering;

    public Car(int speed, int gearNo, String steering) {
        super(speed);
        this.gearNo = gearNo;
        this.steering = steering;
    }

    public int getGearNo() {
        return gearNo;
    }

    public void setGearNo(int gearNo) {
        this.gearNo = gearNo;
    }

    public String getSteering() {
        return steering;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("car is moving with speed " + this.getSpeed());
    }

    public void changeGears(int gearNo){
        this.gearNo = gearNo;
    }
}
