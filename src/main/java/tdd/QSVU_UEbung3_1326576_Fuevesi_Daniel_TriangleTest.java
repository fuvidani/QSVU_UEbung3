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
        Assert.assertEquals(39.94058086708304,result,0.00000000000001);
    }

    @Test
    public void calculateHypotenuse_WithExtremeValueCloseToZero(){
        double result = triangle.calculateHypotenuse(0.025,0.013);
        Assert.assertEquals(0.028178005607210743,result,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateHypotenuse_WithZeroParameter1ShouldThrowException(){
        triangle.calculateHypotenuse(cathetus1,0);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateHypotenuse_WithZeroParameter2ShouldThrowException(){
        triangle.calculateHypotenuse(0,cathetus2);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateHypotenuse_WithNegativeParameter2ShouldThrowException(){
        triangle.calculateHypotenuse(cathetus1,-0.0002);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateHypotenuse_WithNegativeParameter1ShouldThrowException(){
        triangle.calculateHypotenuse(-123,cathetus2);
        Assert.fail();
    }

    @Test
    public void calculateSecondAngle_WithValidParameterShouldCalculateCorrectly(){
        double result = triangle.calculateSecondAngle(34.3);
        Assert.assertEquals(55.7,result,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateSecondAngle_WithInvalidParameterShouldThrowExceptionA(){
        triangle.calculateSecondAngle(91);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateSecondAngle_WithInvalidParameterShouldThrowExceptionB(){
        triangle.calculateSecondAngle(0);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateSecondAngle_WithInvalidParameterShouldThrowExceptionC(){
        triangle.calculateSecondAngle(143);
        Assert.fail();
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateSecondAngle_WithNegativeParameterShouldThrowException(){
        triangle.calculateSecondAngle(-1);
        Assert.fail();
    }

}
