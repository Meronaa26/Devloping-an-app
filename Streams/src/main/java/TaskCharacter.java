import java.util.Arrays;
import java.util.List;

public class TaskCharacter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java","apple","honda","developer");
        String x="java";
        System.out.println(x.length());

        words.stream().map(String ::length).forEach(System.out::println);
    }
}
