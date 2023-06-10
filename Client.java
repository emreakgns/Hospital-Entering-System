
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

	private Socket soc;
	private PrintWriter out;
	private String str;
	private BufferedReader userInput, in;
	
		public Client() {
		
			try{
				System.out.println("Client started");
				soc = new Socket("localhost",5800);
				userInput = new BufferedReader(new InputStreamReader(System.in));	
				}
				catch(Exception e){
				e.printStackTrace();
				}
	}
}