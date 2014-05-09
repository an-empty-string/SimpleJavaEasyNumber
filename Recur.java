package its.whats;

public class Recur {
    public static void recur(int whatsItDo) {
        recurX(false, whatsItDo); // recurse
    }
    private static boolean recurX(boolean whatsItDo, int whatIsIt) {
        if(whatIsIt > 5)
            return whatsItDo;
        else
            return recurX(!whatsItDo, whatIsIt + 1);
    }
}
