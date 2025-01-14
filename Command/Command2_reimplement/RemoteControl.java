public class RemoteControl {
    private Command[] onCommands = new Command[7];
    private Command[] offCommands = new Command[7];
    // keep history of up to 10 commands
    private Command[] undoCommands = new Command[10];

    public void pressUndo(){
	// System.out.println(java.util.Arrays.toString(undoCommands));
	if (undoCommands[undoCommands.length-1] == null){
	    System.out.println("No undo actions available");
	    return;
	}
	StackUtils.pop(this.undoCommands).undo();
	// System.out.println(java.util.Arrays.toString(undoCommands));	
    }
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
	if (!(onCommands[slotNumber] instanceof NoCommand)){
	    StackUtils.pushToStack(this.undoCommands, onCommands[slotNumber]);
	}
    }

    public void pressOff(int slotNumber){
	offCommands[slotNumber].execute();
	if (!(onCommands[slotNumber] instanceof NoCommand)){
	    StackUtils.pushToStack(this.undoCommands, offCommands[slotNumber]);
	}

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
