package Case_study_new.libs;

import Case_study_new.models.Booking;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking>, Serializable {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getIdBooking().compareTo(o2.getIdBooking()) != 0) {
            if (o1.getStartDate().compareTo(o2.getStartDate()) > 0) {
                return 1;
            } else if (o1.getStartDate().compareTo(o2.getStartDate()) < 0) {
                return -1;
            } else if (o1.getStartDate().compareTo(o2.getStartDate()) == 0) {
                if (o1.getEndDate().compareTo(o2.getEndDate()) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        return 0;
    }
}


//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        if ((LocalDate.parse(o1.getStartDate(), formatter)).compareTo((LocalDate.parse(o2.getStartDate(), formatter))) > 0) {
//            return 1;
//        }else if ((LocalDate.parse(o1.getStartDate(), formatter)).compareTo((LocalDate.parse(o2.getStartDate(), formatter))) < 1){
//            return -1;
//        }else {
//            return 1;
//


