public class Slot {
    Command command;
    public void setCommand(Command command){
	this.command = command;
    }

    public void pressOn(){
	command.on();
    }

    public void pressOff(){
	command.off();
    }
}
