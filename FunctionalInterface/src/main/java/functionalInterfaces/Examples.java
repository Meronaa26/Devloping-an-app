package functionalInterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {


        //**********************PREDICATE***********//
//        Predicate<Integer>lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {    // this is called ANONYMOUS  class
//                return integer<18;
//            }
//        };
//        lesserThan.test(50);


        Predicate<Integer>lesserThan =a -> a<18;   // Implementation of test method that belongs to  Predicate interface
       Boolean result  = lesserThan.test(50);  // test is a method that comes with the predicate
        System.out.println(result);



        //**********************CONSUMER***********//

        Consumer<Integer>display = i -> System.out.println(i);
         display.accept(50); // it just accepts what you gave it


        //**********************BIGCONSUMER***********//

        BiConsumer<Integer , Integer> addTwo =(x, y)-> System.out.println(x+y);
        addTwo.accept(100,200);

        //**********************Function***********//

        Function<String, String>fun =s-> "hello  " + s;
        String str = fun.apply("MERON");
        System.out.println(str);
        System.out.println(fun.apply("Hiruta miss you"));


        //**********************SUPPLIER***********//
        Supplier<Double>randomValue=()->Math.random();
        System.out.println( randomValue.get());
    }
}
