import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
       return Stream.of(
                  new Employee(100,"Meron","meronaa26@gmail.com", Arrays.asList("2064062154","2064062154","120681295")),
                  new Employee(101,"Hiruta","ethiye1@yahoo.com", Arrays.asList("5104062154","5104062154","151081295")),
                   new Employee(102,"Abel","meronaa26@gmail.com", Arrays.asList("7044062154","7044062154","704181295"))
                           );

    }
}


