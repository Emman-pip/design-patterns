public class OpenGarageCommand implements Command {
    Garage garage;
    public OpenGarageCommand(){
	garage = new Garage();
    }
    public void execute(){
	garage.open();
    }
}
