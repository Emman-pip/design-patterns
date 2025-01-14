public class StackUtils {
    public static void pushToStack(Command[] arr, Command newVal){
	for (int i = 0; i < arr.length - 1; i++){
	    arr[i] = arr[i+1];
	}
	arr[arr.length - 1] = newVal;
    }

    public static Command pop(Command[] arr){
	Command res = arr[arr.length - 1];

	for (int i = arr.length - 1; i > 0; i--){
	    arr[i] = arr[i-1];
	}

	arr[0] = new NoCommand();

	return res;
    }

}
