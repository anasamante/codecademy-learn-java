package variables;
/*
Java Variables: Mad Libs
PROJECT
Let’s build fluency in Java fundamentals. In this next Pro Project,
we’re going to practice creating variables and printing.
You have learned these skills already, so we’re going to put them to the test by generating a story, Mad Libs style.
For this project, we have provided the story, but it will be up to you to complete the following:
Create all the variables needed for the story.
Print the story with the variables in the right places.
 */

public class MadLibs {
    /*
This program generates a mad libbed story.
Author: Ana
Date: 2/24/2021
  */
    public static void main(String[] args) {
        String name1 = "Ana";
        String name2 = "Rami";
        String adjective1 = "orange";
        String adjective2 = "rampant";
        String adjective3 = "majestic";
        String verb1 = "understand";
        String noun1 = "exam";
        String noun2 = "clothes";
        String noun3 = "suggestion";
        String noun4 = "economics";
        String noun5 = "selection";
        String noun6 = "bonus";
        int number = 2;
        String place1 = "Estonia";

        String story = "This morning "+name1+" woke up feeling "+adjective1+
                ". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+
                "s were protesting to keep "+noun2+" in stores. They began to "+verb1+
                " to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+
                ". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+
                " in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+
                "s ruled the world.";
        System.out.println(story);
    }
}