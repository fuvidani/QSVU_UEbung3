package main.java.testisolation;

import java.util.Date;

/**
 * <h4>About this class</h4>
 * <p>Description</p>
 *
 * @author Daniel Fuevesi
 * @version 1.0.0
 * @since 02.12.15
 */
public interface TimeService {

    public Date getCurrentDate();

    public long daysBetween(Date dateFrom, Date dateTo);
}
