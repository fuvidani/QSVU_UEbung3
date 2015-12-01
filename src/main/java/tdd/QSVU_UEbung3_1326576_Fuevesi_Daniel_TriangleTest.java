package main.java.tdd;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * <h4>About this class</h4>
 * <p>Description</p>
 *
 * @author Daniel Fuevesi
 * @version 1.0.0
 * @since 01.12.15
 */
public class QSVU_UEbung3_1326576_Fuevesi_Daniel_TriangleTest {

    private QSVU_UEbung3_1326576_Fuevesi_Daniel_Triangle triangle;
    private double cathetus1 = 22.5;
    private double cathetus2 = 33;
    private double angle1 = 34.3;

    @Before
    public void setUp(){
        triangle = new QSVU_UEbung3_1326576_Fuevesi_Daniel_Triangle();
    }

    @After
    public void tearDown(){
        triangle = null;
    }

    @Test
    public void calculateHypotenuse_ShouldReturnCorrectResult(){
        double result = triangle.calculateHypotenuse(cathetus1,cathetus2);
        Assert.assertEquals(39.9,result,0.0001);
    }

}
