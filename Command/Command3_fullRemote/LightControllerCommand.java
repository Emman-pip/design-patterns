public class LightControllerCommand implements Command {
    Light light;

    public LightControllerCommand(){
	light = new Light();
    }
    
    public void on(){
	light.on();
    }

    public void off(){
	light.off();
    }
}
