package Com.oop;

public class main {
    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Tomato", 0.75);
        hamburger.addHamburgerAddition3("Tomato", 1.13);

        System.out.println("Total Burger price is "+   hamburger.itemizeHamburger());

        HealthyBurger healthyBurger =new HealthyBurger("Bacon",+5.67);

        healthyBurger.addHealthAddition1("Egg",5.43);
        healthyBurger.addHealthAddition2("Lentiles ",3.14);


        System.out.println("Total Health Burger price is "+healthyBurger.itemizeHamburger());







    }
}