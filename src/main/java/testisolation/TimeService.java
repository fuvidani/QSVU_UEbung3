package main.java.testisolation;

import java.util.Date;

/**
 * <h4>Time Service</h4>
 * <p>A very simple TimeService just for experimentation.</p>
 *
 * @author Daniel Fuevesi
 * @version 1.0.0
 * @since 02.12.15
 */
public interface TimeService {

    /**
     * Get the current date.
     *
     * @return current date
     */
    public Date getCurrentDate();

    /**
     * Returns the number of days between two dates.
     * @param dateFrom date from
     * @param dateTo date to
     * @return days between dateFrom and dateTo
     * @throws IllegalArgumentException
     *          if fromDate or toDate is not valid
     */
    public long daysBetween(Date dateFrom, Date dateTo);
}
