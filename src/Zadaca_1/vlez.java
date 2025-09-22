package Zadaca_1;

/**
 * Represents a triangle with three sides and provides methods to access them and validate the triangle.
 */
public class vlez {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    /**
     * Constructor for Triangle.
     * @param sideA Length of side A
     * @param sideB Length of side B
     * @param sideC Length of side C
     */
    public vlez(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Gets side A length.
     * @return Length of side A
     */
    public double getSideA() {
        return sideA;
    }

    /**
     * Gets side B length.
     * @return Length of side B
     */
    public double getSideB() {
        return sideB;
    }

    /**
     * Gets side C length.
     * @return Length of side C
     */
    public double getSideC() {
        return sideC;
    }

    /**
     * Checks if the sides form a valid triangle using the triangle inequality theorem.
     * @return true if a valid triangle, false otherwise
     */
    public boolean isValid() {
        return (sideA + sideB > sideC) &&
               (sideA + sideC > sideB) &&
               (sideB + sideC > sideA);
    }
}

//This code has been contributed by Kristijan Jordanovski 