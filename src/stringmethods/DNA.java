package stringmethods;
/*
DNA Sequencing
The genome of an organism stores all the genetic information necessary to build and maintain that organism.
It is an organism’s complete set of DNA.
DNA is composed of a series of nucleotides abbreviated as:
A: Adenine
C: Cytosine
G: Guanine
T: Thymine
So a strand of DNA could look something like ACGAATTCCG.
Write a DNA.java program that determines whether there is a protein in a strand of DNA.
A protein has the following qualities:
It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
So for example:
ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.
ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.
 */

public class DNA {

    public DNA(String dna) {
        this.dna = dna;
    }

    String dna;
    int startCodon;
    int stopCodon;

    public void findLength(){
        int dnaLength = dna.length();
    }

    public int findStartCodon(){
        startCodon = dna.indexOf("ATG");
        return startCodon;
    }

    public int findStopCodon(){
        stopCodon = dna.indexOf("TGA");
        return stopCodon;
    }

    public void isProtein(){
        if (startCodon != -1 && stopCodon != -1 && (stopCodon - startCodon) % 3 ==0){
            System.out.println(dna + " It is a protein!");
        } else {
            System.out.println( dna + " It is not a protein!");
        }
    }


    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        DNA firstDna = new DNA(dna3);
        firstDna.findLength();
        firstDna.findStartCodon();
        firstDna.findStopCodon();
        firstDna.isProtein();

    }
}
