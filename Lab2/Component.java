
//This is the abstract prototype class for components which contains the abstract clone method
public abstract class Component {
    /* TODO Implement an appropriate interface method */
    public String objectName;

    //regular constructor
    public Component () {}

    //prototype constructor
    public  Component(Component source){
        this.objectName = source.objectName;
    }

    //abstract clone method
    public abstract Component clone();
}
