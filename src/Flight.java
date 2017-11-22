import java.sql.Time;

/**
 * Created by משתמש on 21/11/2017.
 */
public class Flight {
    final int MAX_CAPACITY = 25;
    String _origin;
    String _destination;
    Time1 _departure;
    int _flightDuration;
    int _noOfPassengers;
    boolean _isFull;
    int _price;

    Flight(String originOther , String destinationOther , int hour , int min , int flightDurationOther , int noOFPassengersOther , int priceOther){
        if(noOFPassengersOther > MAX_CAPACITY)
            noOFPassengersOther = MAX_CAPACITY;
        if(noOFPassengersOther < 0)
            noOFPassengersOther = 0;
        if(MAX_CAPACITY - noOFPassengersOther > 0)
            _isFull = false;
        else
            _isFull = true;
        if(flightDurationOther < 0 )
            flightDurationOther = 0;
        if(priceOther < 0 )
            priceOther = 0 ;
        _departure = new Time1(hour , min);

    }
    Flight(Flight flight){
        _origin = flight._origin;
        _destination = flight._destination;
        _departure = flight._departure;
        _flightDuration =flight._flightDuration;
        _noOfPassengers = flight._noOfPassengers;
        _isFull =flight._isFull;
        _price = flight._price;
    }
}
