package variables;
/*
It’s time to build fluency with operators in Java. In this project,
we’re going to practice arithmetic in Java so you can hone your skills and feel confident taking them to the real world.
Why? Practicing computing integer values with Java’s arithmetic operators will help you with a wide,
wide range of Java tasks in the future.
In this project, you will become a mathemagician and write a small program that performs a mathematical magic trick!
It will involve performing arithmetic operations on an integer that you choose.
 */

public class Magic {
    public static void main(String[] args) {
        //this is the original number
        int myNumber = 54;
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        System.out.println(magicNumber);
    }
}


