package main.java.testisolation;

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
 * @since 02.12.15
 */
public class QSVU_UEbung3_1326576_Fuevesi_Daniel_TimeService_StubTest {

    private ChristmasCounter christmasCounter;

    @Before
    public void setUp(){
        this.christmasCounter = new ChristmasCounter(new QSVU_UEbung3_1326576_Fuevesi_Daniel_TimeService_Stub());
    }

    @After
    public void tearDown(){
        this.christmasCounter = null;

    }

    @Test
    public void calculateDaysToChristmas_ShouldReturnStubbedSolution(){
        Assert.assertTrue(this.christmasCounter.calculateDaysToChristmas() == 22);
    }
}
