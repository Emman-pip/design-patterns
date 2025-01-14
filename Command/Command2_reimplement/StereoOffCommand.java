public class StereoOffCommand implements Command {
    public Stereo stereo;

    public StereoOffCommand(){
	stereo = new Stereo();
    }
    
    public void execute(){
	stereo.off();
    }

    public void undo(){
	stereo.on();
	stereo.setRadio();
	stereo.setVolume(40);
    }
}
