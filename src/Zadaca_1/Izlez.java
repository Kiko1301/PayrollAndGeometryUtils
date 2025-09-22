package Zadaca_1;

import java.util.Scanner;

/**
 * Main class to validate and classify a triangle based on user-provided side lengths.
 * Contributed by Kristijan Jordanovski.
 */
public class Izlez {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    /**
     * Constructor for TriangleValidator.
     * @param sideA Length of side A
     * @param sideB Length of side B
     * @param sideC Length of side C
     */
    public Izlez(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get and validate side lengths
        double sideA = getValidSideLength(scanner, "Enter side A: ");
        double sideB = getValidSideLength(scanner, "Enter side B: ");
        double sideC = getValidSideLength(scanner, "Enter side C: ");

        // Create TriangleValidator object
        Izlez triangle = new Izlez(sideA, sideB, sideC);

        // Check if triangle is valid and classify it
        if (triangle.isValid()) {
            System.out.println("A triangle exists with the given sides.");
            String triangleType = triangle.classifyTriangle();
            System.out.println("It is a " + triangleType + " triangle.");
        } else {
            System.out.println("No triangle exists with the given sides.");
        }

        scanner.close();
    }

    /**
     * Gets a valid side length from the user.
     * @param scanner Scanner object for input
     * @param prompt Prompt message to display
     * @return Valid positive side length
     */
    private static double getValidSideLength(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double side = scanner.nextDouble();
                if (side <= 0) {
                    System.out.println("Error: Side length must be positive.");
                    continue;
                }
                return side;
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    /**
     * Classifies the triangle as right, acute, or obtuse.
     * @return Type of triangle
     */
    private String classifyTriangle() {
        double[] sides = {sideA, sideB, sideC};
        java.util.Arrays.sort(sides);
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        double aSquared = a * a;
        double bSquared = b * b;
        double cSquared = c * c;

        if (Math.abs(cSquared - (aSquared + bSquared)) < 0.0001) {
            return "right";
        } else if (cSquared < aSquared + bSquared) {
            return "acute";
        } else {
            return "obtuse";
        }
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
}

//This code has been contributed by Kristijan Jordanovski 