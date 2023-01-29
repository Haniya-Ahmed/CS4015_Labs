
//this is the concrete prototype for clip components
public class Clip extends Component{

    public double clipDuration;
    public double clipVolume;
    public double clipSpeed;

    public Clip() {}

    public Clip(Clip source){
        super(source);
        this.clipDuration = source.clipDuration;
        this.clipVolume = source.clipVolume;
        this.clipSpeed = source.clipSpeed;
    }

    //concrete clone method
    public Component clone(){
        return new Clip(this);
    }
}
