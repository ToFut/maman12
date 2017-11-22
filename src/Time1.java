import java.util.*;


/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time1
{

    int _hour;
    int _minute;

    public Time1(int hour ,int min) {
        if(!(hour >=0 && hour <= 23)){
            hour = 0;
        }
        if(!(min >=0 && min <= 59)){
            min = 0;
        }
    }
    public Time1(Time1 time) {
        _hour = time._hour;
        _minute = time._minute;
    }

    public int getHour() {
        return _hour;
    }

    public int getMinute() {
        return _minute;
    }

    public void setHour (int num) {
        if(!(num >=0 && num <= 23)){
            _hour = num;
        }

    }

    public void setMinute (int num) {
        if(!(num >=0 && num <= 59)){
            _minute = num;
        }

    }
    public String toString() {
        String returnString ;
        if(!(_hour > 9 && _hour <= 23)){
            // hour doesnt need 0 befor digit
            if(!(_minute > 9 && _minute <= 59)) {
                // both dont need 0 befor digit
                returnString = _hour+":"+_minute;
            }
            else {
                // min need 0 befor digit
                returnString = _hour+":"+"0"+_minute;
            }
        }
        else {
            // hour need 0 befor digit
            if(!(_minute > 9 && _minute <= 59)) {
                // hour need 0 befor digit and min doesnt need 0 befor digit
                returnString = "0"+_hour+":"+_minute;
            }
            else {
                // both need 0 befor digit
                returnString = "0"+_hour+":"+"0"+_minute;
            }
        }
        return returnString;
    }
    public boolean equals (Time1 other) {
        if(other._hour == _hour && other._minute == _minute)
            return true;
        return false;
    }
    public int minFromMidnight() {
        int firstHour = _hour * 60;
        int FromMidNight = firstHour + _minute;
        return FromMidNight;
    }
    public boolean before (Time1 other) {
        if(other._hour > _hour) {
            return true;
        }
        else if(other._hour == _hour) {
            if(other._minute > _hour) {
                return true;
            } else {
                return false;
            }

        }
        else {
            return false;
        }


    }
    public boolean after (Time1 other) {
        boolean retFromBefore  = this.before(other);
        return (!retFromBefore);
    }
    public int difference(Time1 other) {
        int thisTime = minFromMidnight();
        int minOther = other._minute;
        int minInOtherHour = other._hour * 60 ;
        int otherTime  = minOther + minInOtherHour;
        // I assume that otherTime < thisTime
        return thisTime - otherTime;
    }


}
