package main.java.testisolation;

import java.util.Date;

/**
 * <h4>An implementation of {@link TimeService}</h4>
 * <p></p>
 *
 * @author Daniel Fuevesi
 * @version 1.0.0
 * @since 02.12.15
 */
public class TimeServiceImpl implements TimeService {

    private static final long ONE_DAY = 1000L * 60L * 60L * 24L;

    @Override
    public Date getCurrentDate() {
        return new Date();
    }

    @Override
    public long daysBetween(Date dateFrom, Date dateTo) {
        if(dateFrom == null || dateTo == null){
            throw new IllegalArgumentException("date mustn't be null");
        }
        if(dateFrom.after(dateTo)){
            throw new IllegalArgumentException("fromDate mustn't be after toDate");
        }
        return ((dateTo.getTime() - dateFrom.getTime())* TimeServiceImpl.ONE_DAY);
    }
}
