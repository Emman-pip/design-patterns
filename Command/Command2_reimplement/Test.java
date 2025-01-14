public class Test {
    public static void main(String[] args){
        RemoteControl remote = new RemoteControl();
	remote.printConfiguration();

	remote.setCommand(0, new OpenGarageCommand(), new CloseGarageCommand());

	remote.setCommand(1, new StereoOnCommand(), new StereoOffCommand());
	remote.printConfiguration();

	remote.pressOn(0);
	remote.pressOff(0);

	remote.pressOn(1);
	remote.pressOff(1);

	remote.pressOn(2);
	remote.pressOff(2);

    }
}
