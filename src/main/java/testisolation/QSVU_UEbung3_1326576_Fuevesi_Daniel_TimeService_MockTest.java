package main.java.testisolation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * <h4>Test of {@link TimeService} using a Mock-object</h4>
 * <p>Description</p>
 *
 * @author Daniel Fuevesi
 * @version 1.0.0
 * @since 01.12.15
 */
public class QSVU_UEbung3_1326576_Fuevesi_Daniel_TimeService_MockTest {

    private ChristmasCounter christmasCounter;
    private QSVU_UEbung3_1326576_Fuevesi_Daniel_TimeService_Mock mock;

    @Before
    public void setUp(){
        this.mock = new QSVU_UEbung3_1326576_Fuevesi_Daniel_TimeService_Mock();
        /* Mock our ChristmasCounter */
        this.christmasCounter = new ChristmasCounter(mock);
    }

    @After
    public void tearDown(){
        this.mock = null;
        this.christmasCounter = null;
    }

    @Test
    public void calculateDaysToChristmas_ShouldRunOperationInCorrectOrder(){
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH , 2);

        /* Set up mocked values */
        mock.setCurrentDate(calendar.getTime());
        mock.setDaysBetween(22);

        /* Mocked days must be returned */
        Assert.assertTrue(christmasCounter.calculateDaysToChristmas() == 22);

        /* Methods must be called in a proper order */
        Assert.assertTrue(mock.isInRightOrder());

    }

    @Test
    public void calculateDaysToChristmas_ShouldRunOperationInCorrectOrder2(){
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH , 18);

        /* Set up mocked values */
        mock.setCurrentDate(calendar.getTime());
        mock.setDaysBetween(6);

        /* Mocked days must be returned */
        Assert.assertTrue(christmasCounter.calculateDaysToChristmas() == 6);

        /* Methods must be called in a proper order */
        Assert.assertTrue(mock.isInRightOrder());

    }
}
