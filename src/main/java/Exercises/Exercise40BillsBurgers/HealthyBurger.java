package Exercises.Exercise40BillsBurgers;

public class HealthyBurger  extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price = 0;
    private String healthyExtra2Name;
    private double healthyExtra2Price = 0;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
    }
}
