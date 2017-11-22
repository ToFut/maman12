/**
 * Write a description of class Time2 here.
 *
 * @author segev binyamin halfon
 */
public class Time2 {

    int _minFromMid = 0;

    Time2 (int h, int m) {
        if(h < 24 && h >= 0)
            _minFromMid += h * 60;
        else
            _minFromMid += 0;
        if(m < 60 && m >= 0)
            _minFromMid += m;
    }
    Time2 (Time2 other) {
        _minFromMid = other._minFromMid;
    }
    public int getHour() {
        return _minFromMid/60;
    }
    public int getMinute() {
        return _minFromMid%60;
    }
    public void setHour (int num){
        if(num < 24 && num >= 0)
            _minFromMid += num*60;
    }
    public void setMinute (int num){
        if(num < 60 && num >= 0)
            _minFromMid += num;
    }
    public int minFromMidnight() {
        return _minFromMid;
    }
    public boolean equals(Time2 other){
        if(other._minFromMid == _minFromMid)
            return true;
        return false;
    }
    public boolean before(Time2 other) {
        if(_minFromMid < other._minFromMid)
            return true;
        return false;
    }
    public boolean after(Time2 other) {
        return !before(other);
    }
    public int difference(Time2 other) {
        return _minFromMid - other._minFromMid;
    }
    public String toString(){
        String returnString ;
        int hour = getHour();
        int minute = getMinute();
        if(!(hour > 9 && hour <= 23)){
            // hour doesnt need 0 befor digit
            if(!(minute > 9 && minute <= 59)) {
                // both dont need 0 befor digit
                returnString = hour+":"+minute;
            }
            else {
                // min need 0 befor digit
                returnString = hour+":"+"0"+minute;
            }
        }
        else {
            // hour need 0 befor digit
            if(!(minute > 9 && minute <= 59)) {
                // hour need 0 befor digit and min doesnt need 0 befor digit
                returnString = "0"+hour+":"+minute;
            }
            else {
                // both need 0 befor digit
                returnString = "0"+hour+":"+"0"+minute;
            }
        }
        return returnString;
    }
}
