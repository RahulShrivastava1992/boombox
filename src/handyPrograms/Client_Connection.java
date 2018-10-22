package handyPrograms;
import java.net.*;
import java.io.*;
public class Client_Connection {
	
	private Socket socket=null;
	private BufferedReader input=null;
	private DataOutputStream output=null;
	
	public Client_Connection(String Ipaddress, int port)
	{
		try {
			socket=new Socket(Ipaddress,port);
			System.out.println("Connected !");
			input=new BufferedReader(new InputStreamReader(System.in));
			output=new DataOutputStream(socket.getOutputStream());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String line="";
		while(!line.equals("Over"))
		{
			try {
				line=input.readLine();
				output.writeUTF(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			input.close();
			output.close();
			socket.close();
			System.out.println("Closed connection!");
		}
		catch(IOException ex)
		{
			System.out.println("Unable to close with exception"+ex);
		}
		
	}
	public static void main(String args[])
	{
		Client_Connection client = new Client_Connection("127.0.0.1", 5000);
	}
}
