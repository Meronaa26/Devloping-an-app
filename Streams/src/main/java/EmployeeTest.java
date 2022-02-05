import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {


        //print all emails ==> one employee has one email ==> One-to-One
        EmployeeData.readAll()
                   .map(Employee::getEmpEmail)
                          .forEach(System.out::println);

        // print all phone numbers==? one-to-many
        EmployeeData.readAll().
                    map(Employee::getEmpPhoneNumbers).
                                forEach(System.out::println);
        System.out.println("*************FLAT MAP*************");// using FlatMap and see the result is in flat
        EmployeeData.readAll().
                flatMap(empl->empl.getEmpPhoneNumbers()
                          .stream()).forEach(System.out::println);

        System.out.println("***********FLAT MAP WITH DOUBLECOLON***************");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                                .flatMap(List::stream)
                                       .forEach(System.out::println);
    }
}
