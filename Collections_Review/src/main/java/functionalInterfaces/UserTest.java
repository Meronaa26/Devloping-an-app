package functionalInterfaces;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class UserTest {
    public static void main(String[] args) {

                                            //*****ACCEPTANCE CRITERIA ==>  //print all elements in the list
                                                                           //print all users that last name starts with E
        List<User>users = new ArrayList<>();
          users.add(User.builder().firstName("Abel").lastName("Teweldemedhein").age(35).build());
        users.add(User.builder().firstName("Elilta").lastName("Tesfay").age(25).build());
        users.add(User.builder().firstName("Selam").lastName("Abraham").age(40).build());
        users.add(User.builder().firstName("Tsion").lastName("Ethiye").age(15).build());

        //print all elements in the list

        printName(users,p->true);
        System.out.println("*********************************");

        //print all users that last name starts with E

        printName(users ,user->user.getLastName().startsWith("E"));
        printName(users,bx->bx.getAge()>30);
    }
    private static void printName(List<User> users , Predicate<User> p){
        for(User user : users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
