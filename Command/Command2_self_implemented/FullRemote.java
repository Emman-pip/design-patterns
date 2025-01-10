public class FullRemote {
    public Slot[] slots = {null,null,null,null,null,null,null };

    public FullRemote(){
	for (int i =0 ; i < slots.length ; i++){
	    slots[i] = new Slot();
	}
    }
}
