package conditionalscontrolflow;
/*
we’re going to practice conditionals in Java so you can hone your skills and feel confident taking them to the real world.
Let’s combine a few of the concepts that you have learned so far: conditionals, Boolean expressions, and arithmethic expressions.

In this project, you will write a program that will calculate the monthly car payment a user should expect to make
after taking out a car loan. The program will include the following:

Car loan amount
Interest rate of the loan
Length of the loan (in years)
Down payment
The instructions provided are general guidelines. Upon completion of the project, feel free to add functionality of your own.
 */

public class CarLoan {

    int carLoan;
    int loanLength;
    int interestRate;
    int downPayment;

    public CarLoan(int carLoan, int loanLength, int interestRate, int downPayment) {
        this.carLoan = carLoan;
        this.loanLength = loanLength;
        this.interestRate = interestRate;
        this.downPayment = downPayment;
    }

    public void preventInvalidLoan() {
        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else{
            calculateMonthlyPay();
        }
    }

    public void calculateMonthlyPay(){
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance * interestRate)/100;
        int monthlyPayment = monthlyBalance + interest;
        System.out.println("Your monthly pay will be " + monthlyPayment);
    }


    public static void main(String[] args) {
        CarLoan car = new CarLoan (10000,3,5,2000);
        car.preventInvalidLoan();

    }
}