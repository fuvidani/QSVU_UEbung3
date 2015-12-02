package main.java.testisolation;

import java.util.Date;

/**
 * <h4>Mock object for {@link TimeService}</h4>
 * <p>This class mocks the use of {@link TimeService}.
 * It lets the tester set the mocked data dynamically.
 * This mock ensures correct operation order of the called methods.</p>
 *
 * @author Daniel Fuevesi
 * @version 1.0.0
 * @since 01.12.15
 */
public class QSVU_UEbung3_1326576_Fuevesi_Daniel_TimeService_Mock implements TimeService{

    private Date currentDate;
    private long daysBetween;

    private boolean getCurrentDateHasBeenCalled = false;
    private boolean inRightOrder=false;

    /**
     * Sets the mocked current date
     * @param currentDate mocked date
     */
    public void setCurrentDate(Date currentDate){
        this.currentDate = currentDate;
    }

    /**
     * Sets the mocked days that
     * will be returned by {@code daysBetween()}
     * @param daysBetween mocked long
     */
    public void setDaysBetween(long daysBetween){
        this.daysBetween = daysBetween;
    }

    /**
     * @return true iff the methods were called in the proper order
     */
    public boolean isInRightOrder(){
        return this.inRightOrder;
    }

    @Override
    public Date getCurrentDate() {
        this.getCurrentDateHasBeenCalled = true;
        return this.currentDate;
    }

    @Override
    public long daysBetween(Date dateFrom, Date dateTo) {
        if(this.getCurrentDateHasBeenCalled){
            this.getCurrentDateHasBeenCalled = false;
            this.inRightOrder = true;
        }else{
            this.inRightOrder = false;
        }
        return this.daysBetween;
    }
}
