import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,8,9);
        //toCollection(Supplier):is used to create a collection using collectors
        System.out.println("**********  TOCOLLECTION **************");
       List<Integer> numberList =numbers.stream().filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new)) ;    //:: new constructor reference


        System.out.println(numberList);


        System.out.println("**********  SET    **************");
        Set<Integer> numberSet =numbers.stream().filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);


        //toList() : returns a collector interface that gathers the input data into a new list
        System.out.println("************* TO LIST    ***********");
        List<Integer>  numberList2 = numbers.stream().filter(x->x%2==0)
                  .collect(Collectors.toList());

        System.out.println(numberList2);


        //toSet() : returns a collector interface that gathers the input data into a new set
        System.out.println("************* TO SET    ***********");   //unique values
       Set<Integer> numberSet2 =numbers.stream().filter(x->x%2==0).collect(Collectors.toSet());
        System.out.println(numberSet2);

        //toMap(Function , Function) : returns a collector interface that gathers the input data into a new map
        System.out.println("************* TO MAP   ***********");
        Map<String,Integer> dishMap = DishData.getAll().stream().collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);


        //counting() :returns  a collector that counts the number of the elements
        System.out.println("************* COUNTING()   ***********");

     Long eventcount = numbers.stream()
                            .filter(x->x%2==0).
                                 collect(Collectors.counting());
       System.out.println(eventcount);

       //summingInt(ToIntFunction) : returns a collector that
        System.out.println("************* summingInt()   ***********");
      Integer sum =  DishData.getAll().stream()
                               .collect(Collectors.summingInt(Dish::getCalories));




    }
}
