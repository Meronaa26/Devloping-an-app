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
    }
}
