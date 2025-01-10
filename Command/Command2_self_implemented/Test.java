public class Test {
    public static void main(String[] args){
	FullRemote remote = new FullRemote();
	remote.slots[0].setCommand( new GarageControllerCommand());
	remote.slots[0].pressOn();
	remote.slots[0].pressOff();

	remote.slots[0].pressOff();
	remote.slots[0].pressOn();
	remote.slots[0].pressOff();
    }
}
