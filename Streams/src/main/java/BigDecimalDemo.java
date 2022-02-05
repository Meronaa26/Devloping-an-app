import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {
        double d1= 174.56;
        double d2 =174.46;


        System.out.println(d1-d2);// you can not to this in real world because the result is a lot of decimals  0.09999999999999432

        BigDecimal b1 = new BigDecimal("174.56");
        BigDecimal b2 = new BigDecimal("174.46");

        System.out.println(b1.subtract(b2));  //0.10



        //SCALING AND ROUNDING

        BigDecimal number1  =  new BigDecimal(23.12);
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        System.out.println(number1.setScale(2, RoundingMode.CEILING));
        System.out.println(number1.setScale(2, RoundingMode.FLOOR));

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));// kind of the differences 
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("3")));
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));


    }
}
