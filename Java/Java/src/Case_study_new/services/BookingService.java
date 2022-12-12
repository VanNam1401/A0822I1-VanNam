package Case_study_new.services;


import Case_study_new.libs.CatchRegexString;
import Case_study_new.utils.ReadAndWriteBooking;

public interface BookingService{
    void addBooking(ReadAndWriteBooking readAndWrite);
    void displayListBooking(ReadAndWriteBooking readAndWrite);
}
