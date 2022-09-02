package Classes;

public class VIPCustomer {
    private String name;
    private double limit;
    private String email;

    public VIPCustomer() {
        this("default name", 10000, "default mail");
    }

    public VIPCustomer(double limit, String email) {
       this("default name", limit, email);
    }

    public VIPCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
