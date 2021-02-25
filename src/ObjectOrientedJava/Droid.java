package ObjectOrientedJava;

/*
Practice object-oriented Java by creating a Droid class and creating different instances of Droid.
We’ve set up a robot workshop to build some droids.
All that’s missing are the instructions on how to create the robots and what they’ll do.
Can we write a Java class to help?
We’ll need to define the state and behavior of the droids using instance fields and methods. Let’s get to work!
 */

public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString(){
        return "Hello, I'm " + name + " the droid.";
    }


    public void performTask(String task){
        System.out.println(name + " is " + task);
        batteryLevel -= 10;
    }

    public void energyReport(){
        System.out.println(name + "'s battery level is: " + batteryLevel);
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.energyReport();

        Droid rami = new Droid("Rami");
        System.out.println(rami);
        rami.performTask("cleaning");
        rami.performTask("washing dishes");
        rami.energyReport();

    }

}
