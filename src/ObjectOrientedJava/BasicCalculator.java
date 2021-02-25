package ObjectOrientedJava;

/*
we’re going to practice Classes, Methods, Objects in Java so you can hone your skills and feel confident
 taking them to the real world. Why? It’s vital that you get comfortable creating classes and writing methods
 that perform various operations.
 In this project, you will use classes, methods, and objects to create a simple arithmetic calculator.
 The calculator will be able to:

Add two integers
Subtract two integers
Multiply two integers
Divide two integers
Apply the modulo operator on two integers
The instructions provided are general guidelines.
 */

public class BasicCalculator {

    public BasicCalculator() {
    }
    public double add(double a, double b){
        double sum = a + b;
        return sum;

    }

    public double subtract(double a, double b){
        double difference = a - b;
        return difference;
    }

    public double multiply(double a, double b){
        double product = a * b;
        return product;
    }

    public double divide(double a, double b){
        double quotient = a / b;
        return quotient;
    }

    public double modulo(double a, double b){
        double remainder = a % b;
        return remainder ;
    }

    public static void main(String[] args) {
        BasicCalculator myCalculator = new BasicCalculator();
        System.out.println(myCalculator.add(5.25,7));
        System.out.println(myCalculator.subtract(45,11));
        System.out.println(myCalculator.multiply(5.4,4.4));
        System.out.println(myCalculator.divide(4,87));
        System.out.println(myCalculator.modulo(11,3));
    }
}
