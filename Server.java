import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static boolean user = true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try{
			
		
		System.out.println("Waiting for clients...");
		ServerSocket ss = new ServerSocket(5800);
		
		
		
		while(user==true) {
				
		}
		Socket soc = ss.accept();
		System.out.println("Connected");
		
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}
}