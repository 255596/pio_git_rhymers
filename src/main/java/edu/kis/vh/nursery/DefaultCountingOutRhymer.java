package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MINIVAL = -1;
    public static final int MAXIVAL = 11;
    private final int[] NUMBERS = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == MINIVAL;
    }

    public boolean isFull() {
        return total == MAXIVAL;
    }

    protected int peek() {
        if (callCheck())
            return MINIVAL;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return MINIVAL;
        return NUMBERS[total--];
    }

}
