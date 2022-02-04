import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Employee {
    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumbers;

}
