public class Test {
    public static void main(String[] args){
	Garage garage = new Garage();
	Stereo stereo = new Stereo();
	
        RemoteControl remote = new RemoteControl();
		
	remote.printConfiguration();

	remote.setCommand(0, garage::open, garage::close );
	remote.setCommand(1, () -> {
		stereo.on();
		stereo.setRadio();
		stereo.setVolume(11);
	    }, stereo::off );

	// remote.setCommand(1, new StereoOnCommand(), new StereoOffCommand());
	remote.printConfiguration();
	remote.pressOn(0);
	remote.pressOff(0);

	remote.pressOn(1);
	remote.pressOff(1);

	remote.pressOn(2); # nothing happens here
	remote.pressOff(2);
    }
}
