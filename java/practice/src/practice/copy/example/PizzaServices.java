package practice.copy.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PizzaServices {


    public static String getFoodNames(List<Food> foods) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < foods.size(); i++) {
            result.append(foods.get(i).getName()).append(" x ")
                    .append(foods.get(i).getQuantity()).append("\n");
        }
        return result.toString();
    }

    public static Number getTotalPrices(List<Food> foods) {
        Integer result = 0;
        for (int i = 0; i < foods.size(); i++) {
            result = result.intValue() + foods.get(i).getPrice().intValue();
        }
        return result;

    }

    public static void main(String[] args) {
        List<Food> foodList = Arrays.asList(
            new Food(1, "Coca", 2, 10),
            new Food(2, "pepsi", 1, 2),
            new Food(2, "pizza #2", 1, 2)
        );

        System.out.println(getFoodNames(foodList));
        System.out.println(getTotalPrices(foodList));

        Arrays.asList(new Food[]{new Food(1, "Coca", 2, 10),
                new Food(2, "pepsi", 1, 2),
                new Food(2, "pizza #2", 0, 2)}).stream().filter(input -> input.quantity.intValue() > 0).forEach(System.out::println);

        List<Food> list = Arrays.asList(new Food[]{new Food(1, "Coca", 2, 10),
                new Food(2, "pepsi", 1, 2),
                new Food(2, "pizza #2", 0, 2)}).stream().filter(input -> input.quantity.intValue() > 0).collect(Collectors.toList());
        System.out.println(list.get(0).getName());
        System.out.println(list.get(0).getQuantity());

        System.out.println(list.get(1).getName());
        System.out.println(list.get(1).getQuantity());

        List<Food> listFood1 = new ArrayList<>();
        listFood1.add(new Food(1, "Coca", 2, 10));
        listFood1.add(new Food(2, "pepsi", 1, 2));
        listFood1.add(new Food(2, "pizza #2", 0, 2));
//        List<Food> list2 = listFood1.stream().filter(input -> input.quantity.intValue() > 0).collect(Collectors.toList());
        List<Food> list2 = new ArrayList<>();
        for (int i = 0; i < listFood1.size(); i++) {
            if (listFood1.get(i).quantity.intValue() > 0) {
                list2.add(listFood1.get(i));
            }
        }

        System.out.println(list2.get(0).getName());
        System.out.println(list2.get(0).getQuantity());

        System.out.println(list2.get(1).getName());
        System.out.println(list2.get(1).getQuantity());

    }
}
