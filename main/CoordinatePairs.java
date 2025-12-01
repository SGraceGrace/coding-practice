package main;

public class CoordinatePairs {
    private int x;
    private int y;

    CoordinatePairs(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }
}
