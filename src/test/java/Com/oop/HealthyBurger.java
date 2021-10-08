package Com.oop;

public class HealthyBurger extends Hamburger {
    private String healtyExtra1Name;
    private double healtyExtra1Price;

    private String healtyExtra2Name;
    private double healtyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
        this.healtyExtra1Name = healtyExtra1Name;
    }
    public void addHealthAddition1(String name, double price){
        this.healtyExtra1Name=name;
        this.healtyExtra1Price=price;
    }
    public void addHealthAddition2(String name, double price){
        this.healtyExtra2Name=name;
        this.healtyExtra2Price=price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healtyExtra1Name!=null){
            hamburgerPrice += this.healtyExtra1Price;
            System.out.println("Added "+this.healtyExtra1Name+ "for extra ="+this.healtyExtra1Price);
        }
        if (this.healtyExtra2Name!=null){
            hamburgerPrice += this.healtyExtra2Price;
            System.out.println("Added "+this.healtyExtra2Name+ " for extra ="+this.healtyExtra2Price);
        }
        return hamburgerPrice;


    }
}
