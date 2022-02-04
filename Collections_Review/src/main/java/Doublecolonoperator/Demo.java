package Doublecolonoperator;

public class Demo {
    public static void main(String[] args) {

        // Reference to a static method
        Calculate s1 = (x,y)-> calculator.findSum(x,y);// we can call it directly
        s1.calculate(10,20);

        //same code as above
        Calculate s2 = calculator::findSum;
        s2.calculate(100,35);




        //reference from not static instance method(we can not call the instance method directly)
        Calculate m1= (x,y)->new calculator().findMultiply(x,y);
        m1.calculate(5,6);


        calculator obj= new calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(8,9);

        Calculate m3 = new calculator() ::findMultiply;
        m3.calculate(6,6);

    }
}
