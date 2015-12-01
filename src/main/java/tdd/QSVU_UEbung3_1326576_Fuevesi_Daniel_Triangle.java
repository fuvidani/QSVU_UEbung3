package main.java.tdd;

/**
 * <h4>About this class</h4>
 * <p>Description</p>
 *
 * @author Daniel Fuevesi
 * @version 1.0.0
 * @since 01.12.15
 */
public class QSVU_UEbung3_1326576_Fuevesi_Daniel_Triangle {

    /**
     * Calculates the hypotenuse of a right triangle
     * given the length of the 2 catheti.
     * @param cathetus1 first cathetus of the triangle
     * @param cathetus2 second cathetus of the triangle
     * @return the length of the hypotenuse
     */
    public double calculateHypotenuse(double cathetus1, double cathetus2) throws IllegalArgumentException{
        if(cathetus1 <= 0 || cathetus2 <= 0){
            throw new IllegalArgumentException("Catheti of a right triangle must be positive");
        }
        return Math.sqrt(Math.pow(cathetus1,2) + Math.pow(cathetus2,2));
    }

    /**
     * Calculates the degree of the second unknown angle
     * of a right triangle given a known degree of an angle
     * of the same triangle.
     * @param firstAngle degree of the first angle
     * @return the degree of the second angle
     */
    public double calculateSecondAngle(double firstAngle) throws IllegalArgumentException{
        if(firstAngle <= 0 || firstAngle >= 90){
            throw new IllegalArgumentException("Angle must be between 0 and 90 degree (exclusive)");
        }
        return 90-firstAngle;
    }

    /**
     * Calculates the area of the right triangle
     * given the length of the 2 catheti.
     * @param cathetus1 first cathetus of the triangle
     * @param cathetus2 second cathetus of the triangle
     * @return the area of the right triangle
     */
    public double calculateArea(double cathetus1, double cathetus2){
        return 0;
    }
}
