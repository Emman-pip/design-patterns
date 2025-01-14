public class StereoOnCommand implements Command {
    public Stereo stereo;

    public StereoOnCommand(){
	stereo = new Stereo();
    }
    
    public void execute(){
	stereo.on();
	stereo.setRadio();
	stereo.setVolume(40);
    }
}
