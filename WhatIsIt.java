public class WhatIsIt {
    public static int recur(int x) {
        int a = ((int)(Math.random() * 5));
        int b = ((int)(Math.random() * 3));
        return recur(x, a, b);
    }
    private static int recur(int x, int y, int z) {
        if(x > 5 || y < 0)
            return y; // return y
        else
            return (x + y) * recur(x + 1, y + z, z + 1);
    }
}
