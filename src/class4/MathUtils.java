package class4;

interface MathUtils {

    int add(int x, int y);

    default double getValue(int value) {
        return getSquareRootValue(value);
    }

    private double getSquareRootValue(int value) {
        return Math.sqrt(value);
    }
}
