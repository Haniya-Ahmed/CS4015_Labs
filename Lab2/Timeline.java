
import java.util.ArrayList;
import java.util.List;

//timeline object contains a list of components
public class Timeline {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void print(){
        System.out.println("-------------------------");
        System.out.println("Timeline:");
        for (Component component : components) {
            System.out.println(component.objectName);
        }
        System.out.println("-------------------------");
    }
}
