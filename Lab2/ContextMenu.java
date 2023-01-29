
//This class contains the context menu for the timeline, and method to dubplicate components in the timeline.
public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        // TODO Improve
        Component newComponent = component.clone();
        timeline.add(newComponent);
    }

}
