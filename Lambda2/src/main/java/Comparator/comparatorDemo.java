package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class comparatorDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,1,15,5,20);
        System.out.println(list);

        //ascending order
        Collections.sort(list);
        System.out.println(list);

       //Descending order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        //ascending order
        Collections.sort(list,((o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1:0));

        //ascending order
        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending order
        list.sort((o2,o1) -> o1.compareTo(o2));
        System.out.println(list);


        List<Apple> myInventory = Arrays.asList(
                new Apple( 80 ,Color.GREEN),
                new Apple( 255 ,Color.RED),
                new Apple( 120 ,Color.GREEN)

        );
        Comparator<Apple> sortApple= comparing((apple) -> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);
        // OR WE CAN DO IT
        myInventory.sort(comparing((apple)->  apple.getWeight()));
        myInventory.sort(comparing(Apple :: getWeight));  // these two are same

        //reversed
        myInventory.sort(comparing(Apple :: getWeight).reversed());

        //chaining
        myInventory.
                 sort(comparing(Apple::getColor)
                         .reversed()
                                .thenComparing(Apple::getWeight));

        System.out.println(myInventory);
    }
}
