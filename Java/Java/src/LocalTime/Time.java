package LocalTime;

import java.time.LocalTime;

public class Time {
    private LocalTime startTime , endTime;
    public Time(LocalTime startTime,LocalTime endTime){
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public long getElapsedTime(){
        int miliSecond = ((endTime.getHour() - startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60 + (endTime.getSecond()- startTime.getSecond()))*1000 ;
        return miliSecond;
    }
}
