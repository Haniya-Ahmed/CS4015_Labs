public class ArabianScheduler extends Scheduler {
    @Override
    ArabianCalendar createCalendar() {
        return new ArabianCalendar();
    }
}
