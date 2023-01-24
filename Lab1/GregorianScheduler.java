public class GregorianScheduler extends Scheduler {
    @Override
    GregorianCalendar createCalendar() {
        return new GregorianCalendar();
    }
}

