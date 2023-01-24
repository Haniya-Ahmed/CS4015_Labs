public class GregorianScheduler extends Scheduler {
    @Override
    //concrete factory method
    GregorianCalendar createCalendar() {
        return new GregorianCalendar();
    }
}

