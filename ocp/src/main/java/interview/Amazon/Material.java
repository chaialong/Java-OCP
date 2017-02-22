package interview.Amazon;

public class Material {
    private String name;
    private double price;
    private long amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Material(String name, double price, long amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}
