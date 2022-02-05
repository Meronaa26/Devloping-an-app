import java.util.Optional;

public class MtachingAndFinding {

    public static void main(String[] args) {

        //ALL MATCH
    boolean isHealthy=    DishData.getAll().stream().allMatch(dish->dish.getCalories()<1000);
        System.out.println(isHealthy);

        //ANY MATCH

        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu is vegeterian friendly");

        //NONE MATCH
       boolean isHealthy2= DishData.getAll().stream().noneMatch(dish->dish.getCalories()>1000);
        System.out.println(isHealthy2);

        // Find ANY
        System.out.println("***********OPTIONAL*********");
        Optional<Dish> dish =DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        //FIND FIRST
        Optional<Dish> dish2 =DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

    }
}
