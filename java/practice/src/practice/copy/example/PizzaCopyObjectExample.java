package practice.copy.example;

public class PizzaCopyObjectExample {

    public static void main(String[] args) throws CloneNotSupportedException{
        Food food = new Food(1, "Food 1", 1, 123);
        Pizza pizza = new Pizza(food, "Pizza 1");

        // Deep copy
        System.out.println("\n --- Deep copy use copy constructor ---");
        Pizza pizza2 = new Pizza(pizza);
        System.out.println(pizza == pizza2);
        System.out.println(pizza.getFood().hashCode());
        System.out.println(pizza2.getFood().hashCode());

        pizza2.getFood().setQuantity(1000);
        System.out.println("------ Value --------");
        System.out.println(pizza);
        System.out.println(pizza2);

        // Deep copy
        System.out.println("\n --- Deep copy use clone ---");
        Pizza pizza4 = (Pizza) pizza.clone();
        System.out.println(pizza == pizza4);
        System.out.println(pizza.getFood().hashCode());
        System.out.println(pizza4.getFood().hashCode());

        pizza4.getFood().setQuantity(2000);
        System.out.println("------ Value --------");
        System.out.println(pizza);
        System.out.println(pizza4);

        // Shallow copy
        System.out.println("\n --- Shallow copy by setter ---");
        Pizza pizza3 = new Pizza();
        pizza3.setPizzaName(pizza.getPizzaName());
        pizza3.setFood(pizza.getFood());

        System.out.println(pizza == pizza3);
        System.out.println(pizza.getFood().hashCode());
        System.out.println(pizza3.getFood().hashCode());

        pizza3.getFood().setQuantity(3000);
        System.out.println("------ Value --------");
        System.out.println(pizza);
        System.out.println(pizza3);
    }
}
