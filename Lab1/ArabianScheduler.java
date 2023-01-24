public class ArabianScheduler extends Scheduler {
    @Override
    //concrete factory method
    ArabianCalendar createCalendar() {
        return new ArabianCalendar();
    }
}
