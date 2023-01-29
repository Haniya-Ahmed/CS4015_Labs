
//this is the concrete prototype for audio components
public class Audio extends Component{

    public double audioLength;
    public Audio() {}
    public Audio(Audio source){
        super(source);
        this.audioLength = source.audioLength;
    }

    //concrete clone method
    public Component clone(){
        return new Audio(this);
    }
}
