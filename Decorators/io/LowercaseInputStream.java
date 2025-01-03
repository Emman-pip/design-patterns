import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowercaseInputStream extends FilterInputStream {
    public LowercaseInputStream(InputStream in){
	super(in);
    }

    public int read() throws IOException {
	int c = in.read();
	return (c == -1) ? c : Character.toLowerCase((char)c);
    }

    public int read(byte[] b, int offset, int len) throws IOException{
	int result = in.read(b,offset, len);
	for (int i = offset; i < offset+result; i++){
	    b[i] = (byte)Character.toLowerCase((char)b[i]);
	}
	return result;
	
    }

    
    public static void main(String[] args){
	int c;
	try {
	    InputStream in = new LowercaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
	    while ((c = in.read()) >= 0) {
		System.out.print((char) c);
	    }
	} catch (IOException e){
	    e.printStackTrace();
	}
    }
}
