package ClientSide;
import java.io.*;
import java.net.*;

public class Main {
	public static void main(String args[]) {
		try {
		Socket s = new Socket("171.48.72.200",1234);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF("Hello World");
		dos.close();
		s.close();
		}
		catch(Exception e) {
			System.out.println("Error Occured ClientSide");
		}
	}
}
