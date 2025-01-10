public class GarageControllerCommand implements Command {
    Garage garage;

    public GarageControllerCommand() {
	garage = new Garage();
    }

    public void on(){
	garage.open();
    }

    public void off(){
	garage.close();
    }

}
