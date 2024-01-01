import Actions.confirmFlight;
import Actions.findFlight;
import Actions.returnFlight;
import Actions.selectExtra;
import org.testng.annotations.Test;


public class tests {

    findFlight m = new findFlight();
    confirmFlight confirm = new confirmFlight();
    returnFlight inBound = new returnFlight();
    selectExtra extra = new selectExtra();
    @Test
    public void run()  {
        m.openWebsite();
        m.selectDeparture();
        m.selectDestination();
        m.selectDepartureDate();
        m.selectReturnDate();
        m.submit();
        confirm.selectClass();
        inBound.returnFlight();
        extra.selectSeat();
    }
}
