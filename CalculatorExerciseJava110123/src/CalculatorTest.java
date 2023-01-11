public class CalculatorTest{
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        System.out.println("Sum: "+calculator.add(2,2));

        System.out.println("Subtraction: "+calculator.subtract(10,4));

        System.out.println("Multiplication: "+calculator.multiply(6,7));

        System.out.println("Division: "+calculator.divide(98,34));

        System.out.println("Module: "+calculator.module(35,4));

        System.out.println("Power: "+calculator.power(13,34));

        System.out.println("Root: "+calculator.root(56,90));

        System.out.println("Logarithm: "+calculator.logarithm(24,24));
    }
}
