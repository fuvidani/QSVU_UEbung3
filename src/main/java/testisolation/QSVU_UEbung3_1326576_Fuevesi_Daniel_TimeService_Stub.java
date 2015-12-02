package main.java.testisolation;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * <h4>Stub for {@link TimeService}</h4>
 * <p>This class is a stub for the implementation of
 * {@link TimeService}. The stubbed methods return only
 * hardcoded values.</p>
 *
 * @author Daniel Fuevesi
 * @version 1.0.0
 * @since 02.12.15
 */
public class QSVU_UEbung3_1326576_Fuevesi_Daniel_TimeService_Stub implements TimeService {

    @Override
    public Date getCurrentDate() {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH , 2);
        return calendar.getTime();
    }

    @Override
    public long daysBetween(Date dateFrom, Date dateTo) {
        return 22;
    }
}
