package it.whats;

public class WhatsitDo {
    private int n;
    public WhatsitDo(int a) {
        n = WhatIsIt.recur(a);
    }
    public int getN() { // define the method getN
        return n;
    }
    public int whatIsIt() {
        Mystery whatsItDo = Mystery.unknown();
        if(whatsItDo.isItTrue(5))
            return 1;
        else
            return 2;
    }
}
