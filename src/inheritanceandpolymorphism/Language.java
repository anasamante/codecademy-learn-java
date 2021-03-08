package inheritanceandpolymorphism;
/*Languages, just like people, often have families. You can even map language lineage a bit like a family tree.

Java can help us build a model to track inherited traits across families. In this case, we’ll focus on something that
often varies between language families: word order — where the subject, verb, and object would go in a sentence.

 */
public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args) {
        Language mayan = new Mayan("Ki'che'", 2000);
        Language mandarin = new SinoTibetan("Mandarin Chinese", 5558846);
        Language burmese = new SinoTibetan("Burmese", 65253);
        Language[] languages = {mayan, mandarin, burmese};
        for (Language lan: languages) {
            lan.getInfo();
        }
    }
}
