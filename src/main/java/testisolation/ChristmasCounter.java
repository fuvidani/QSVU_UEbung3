package main.java.testisolation;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * <h4>About this class</h4>
 * <p>Description</p>
 *
 * @author Daniel Fuevesi
 * @version 1.0.0
 * @since 02.12.15
 */
public class ChristmasCounter {

    protected TimeService timeService;

    public ChristmasCounter(TimeService timeService) {
        this.timeService = timeService;
    }

    public long calculateDaysToChristmas() {
        Date currentDate = this.timeService.getCurrentDate();
        Calendar christmas = new GregorianCalendar();
        christmas.setTime(currentDate);
        christmas.set(Calendar.MONTH, Calendar.DECEMBER);
        christmas.set(Calendar.DAY_OF_MONTH , 24);
        return(this.timeService.daysBetween(currentDate , christmas.getTime()));
    }

}
