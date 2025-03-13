package Lab5;

class Pizza {
    private String sizeOfPizza;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza() {
        sizeOfPizza = "small";
        cheeseToppings = 0;
        pepperoniToppings = 0;
        hamToppings = 0;
    }

    public Pizza(String sizeOfPizza, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.sizeOfPizza = sizeOfPizza;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public String getSizeOfPizza() {
        return sizeOfPizza;
    }

    public void setSizeOfPizza(String sizeOfPizza) {
        this.sizeOfPizza = sizeOfPizza;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        int baseCost;
        switch (sizeOfPizza.toLowerCase()) {
            case "small":
                baseCost = 10;
                break;
            case "medium":
                baseCost = 12;
                break;
            case "large":
                baseCost = 14;
                break;
            default:
                throw new IllegalArgumentException("Invalid pizza size: " + sizeOfPizza);
        }
        return baseCost + 2 * (cheeseToppings + pepperoniToppings + hamToppings);
    }

    public String getDescription() {
        return "Size: " + sizeOfPizza +
                ", Cheese Toppings: " + cheeseToppings +
                ", Pepperoni Toppings: " + pepperoniToppings +
                ", Ham Toppings: " + hamToppings +
                ", Cost: $" + calcCost();
    }
}

class PizzaOrder {
    private Pizza[] pizzas = new Pizza[3]; 
    private int pizzaCount = 0; 

    public void addPizza(Pizza pizza) {
        if (pizzaCount < 3) {
            pizzas[pizzaCount] = pizza;
            pizzaCount++;
        } else {
            System.out.println("Cannot add more than 3 pizzas to the order.");
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for (int i = 0; i < pizzaCount; i++) {
            totalCost += pizzas[i].calcCost();
        }
        return totalCost;
    }
}

public class LabTask4 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 1, 2);
        Pizza pizza2 = new Pizza("medium", 2, 2, 1);

        System.out.println("Pizza 1: " + pizza1.getDescription());
        System.out.println("Pizza 2: " + pizza2.getDescription());

        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        System.out.println("Total cost of the order: $" + order.calcTotal());
    }
}
