import java.util.Date;

public abstract class Scheduler {
    abstract Calendar createCalendar(); //factory method
    public void schedule(Event event) {
        var today = new Date();
        createCalendar().addEvent(event, today);
    }
}

