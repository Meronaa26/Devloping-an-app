package Task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {


        // with lambda the advantage is we don't need to create a class to implement the interface
        List<Orange> inventory = new ArrayList<>();                               // collections always accept OBJECT and I want ORANGE objects to be created in here
        inventory.add(new Orange(300,Color.GREEN));                        // we are just adding to the inventory list
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
                                                                                 // the first and second add thing is all same but the issue is if we have 10 fields we will need a constructor  with 10 fields
                                                                                // and  if you paste 9 it will give you error with the first add method with the build thing it is
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        OrangeFormatter simpleFormatter = orange-> "An orange of " + orange.getWeight() + "g";  // this is behaviour ==> to get a weight
        prettyPrintApple(inventory , simpleFormatter);                                    // behaviour parameterization by lambda
        prettyPrintApple(inventory ,orange-> "An orange of " + orange.getWeight() + "g"); // paste the action directly all same with the above line

        System.out.println("******************************");
        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight()>150 ? "  Heavy" :"  Light";
            return "A" + characteristic + " " +orange.getColor() + " orange";
        };

        prettyPrintApple(inventory ,fancyFormatter);
    }


    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){    // because lambda only takes interface(because I don't know what behaviour at this point)
        for(Orange orange: inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
