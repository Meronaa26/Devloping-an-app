package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class UserTest {
    public static void main(String[] args) {
        List<User>users = new ArrayList<>();
      //  users.add(User.builder().fir)

        //print all elements in the list
        //print all users that last name starts with E
    }
    private static void printName(List<User> users , Predicate<User> p){
        for(User user : users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
