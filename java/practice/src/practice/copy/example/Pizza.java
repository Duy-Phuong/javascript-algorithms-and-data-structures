package practice.copy.example;

public class Pizza implements Cloneable{
    private Food food;
    private String pizzaName;

    public Pizza(Pizza pizza) {
        this.food = new Food(pizza.getFood().getId(), pizza.getFood().getName(), pizza.getFood().getQuantity(), pizza.getFood().getPrice());;
        this.pizzaName = pizza.getPizzaName();
    }

    public Pizza() {

    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(Food food, String pizzaName) {
        this.food = food;
        this.pizzaName = pizzaName;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "food=" + food +
                ", pizzaName='" + pizzaName + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Pizza pizza = null;
//        try {
            pizza = (Pizza) super.clone();
//        } catch (CloneNotSupportedException e) {
//            pizza = new Pizza(this.getFood(), this.getPizzaName());
//        }
        pizza.food = (Food) this.food.clone();
        return pizza;
    }
}
