public class NoCommand implements Command {
    public void execute(){
	System.out.println("No commands set");
    }

    public void undo(){
	System.out.println("Nothing to undo...");
    }
}
