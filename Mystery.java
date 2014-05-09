package it.whats;

public class Mystery {
    private boolean doesItWork;
    public Mystery() {
        doesItWork = false;
    }
    public static Mystery unknown() {
        Mystery whatIsIt = new Mystery();
        whatIsIt.doesItWork = true; // assign to doesItWork
        return whatIsIt;
    }
    public boolean isItTrue(double x) {
        return recur(x, (Math.random() > 0.5));
    }
    private boolean recur(double x, boolean y) {
        y = !y;
        if(y) x -= 0.5;
        else  x += 0.7;
        if(x < -2) return true;
        if(x > 2)  return false;
        return recur(x, y);
    }
}
