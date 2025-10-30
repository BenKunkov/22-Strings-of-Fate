

public class StringySpells {

    //middleFinder
    public static String middleFinder(String i){
    int len1 = i.length();
    int middle = len1 / 2;
    return ("") + i.substring(middle, middle + 1);

    }
    public static String alphaOmega (String alpha, String beta){
        String first = alpha.substring(0, 1);
        int lensec = beta.length();
        String second = beta.substring(lensec -1 , lensec);
        return first + second;

    }
    public static String subtractive (String one, int two) {
        return one.substring(0,two) +  one.substring(two + 1);

    }

    public static String flipper (String one, String two){
        String first = one.substring(0);
        String second = two.substring(0, 1);
        return second + first;
    }

    public static double aveLen(String s1, String s2)
    {

        double len1 = s1.length();
        double len2 = s2.length();
        return (len1 + len2) / 2.0;

    }


}//end of class