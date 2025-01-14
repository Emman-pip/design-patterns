public class CloseGarageCommand implements Command {
    Garage garage;
    public CloseGarageCommand(){
	garage = new Garage();
    }

    public void execute(){
	garage.close();
    }

    public void undo(){
	garage.open();
    }
}
