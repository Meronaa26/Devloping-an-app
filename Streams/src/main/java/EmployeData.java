import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeData {
    public static Stream<Employee> readAll(){
       return Stream.of(
                  //new Employee(100,"Meron","meronaa26@gmail.com", Arrays.asList("2064062154","5104062154","181295")) ;
                  // new Employee(101,"Hiruta","ethiye1@yahoo.com", Arrays.asList("2064062154","5104062154","181295"))
                   new Employee(102,"Abel","meronaa26@gmail.com", Arrays.asList("2064062154","5104062154","181295"))
                           );

    }
}


