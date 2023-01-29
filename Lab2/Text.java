
//this is the concrete prototype for text components
public class Text extends Component{
    public String content;

    public Text() {}
    public Text(Text source) {
        super(source);
        this.content = source.content;
    }

    //concrete clone method
    public Component clone() {
        return new Text(this);
    }
    public String getContent() {
        return content;
    }
}
