package za.ac.cput.calculator;

public class Divisiontor {
    /**
     * Returns results of integer division
     * @param numerator
     * @param denominator
     * @return
     */
    public static int integerOfDivision(int numerator, int denominator){
        if (denominator < 1) return 0;
        return numerator / denominator;

    }
}
