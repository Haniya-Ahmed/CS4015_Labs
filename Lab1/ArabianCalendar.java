import java.util.Date;

//concrete product
public class ArabianCalendar implements Calendar {
    public void addEvent(Event event, Date date) {
        System.out.println("Adding an event on the given date on Arabian Calendar.");
    }
}
