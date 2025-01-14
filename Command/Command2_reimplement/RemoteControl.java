public class RemoteControl {
    private Command[] onCommands = new Command[7];
    private Command[] offCommands = new Command[7];

    public RemoteControl(){
	NoCommand noCommand = new NoCommand();
	for (int i = 0; i< 7; i++){
	    onCommands[i] = noCommand;
	    offCommands[i] = noCommand;
	}
    }

    public void setCommand(int slotNumber, Command onCommand, Command offCommand) {
	onCommands[slotNumber] = onCommand;
	offCommands[slotNumber] = offCommand;
    }

    public void pressOn(int slotNumber){
	onCommands[slotNumber].execute();
    }

    public void pressOff(int slotNumber){
	offCommands[slotNumber].execute();
    }

    public void printConfiguration(){
	String configString = "\n\n##########Current Configuration##########\n";
	configString += "slot\ton\t\toff\n";
	for (int i = 0; i<7; i++){
	    configString += String.format("%d\t%s\t%s\n", i, onCommands[i].getClass().getName(), offCommands[i].getClass().getName());

	}
	System.out.println(configString);
    }
}
