public class Runner {
    public static void main(String[] args){
        double avg1 = StringySpells.aveLen("dog", "aplus");
        System.out.println("Average 1: " + avg1);
        double avg2 = StringySpells.aveLen("ap", "pluscat");
        System.out.println("Average 2: " + avg2);
        String middle1 = StringySpells.middleFinder("stinkypoop");
        System.out.println("Middle 1: " + middle1);
        String aomega = StringySpells.alphaOmega("benny", "boo");
        System.out.println("Alpha omega: " + aomega);
        String flipper = StringySpells.flipper("thisis", "supercool");
        System.out.println("Flipper: " + flipper);
        String sub = StringySpells.subtractive ("bennybooo", 1);
        System.out.println("Subtractive: " + sub);



    }
}
