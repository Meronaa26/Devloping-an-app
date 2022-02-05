package DoubleColonComperatore;

public class Demo {
    public static void main(String[] args) {
        Calculate s1= (x,y)-> Calculator.findSum(x,y);
        s1.calculate(10,20);



        Calculate s2 =Calculator::findSum;
        s2.calculate(100,20);
    }
}
