import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Dish {

    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;


}
