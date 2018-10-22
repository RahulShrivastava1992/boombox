package handyPrograms;
import java.net.*;
import java.io.*;
public class Server_Connection {
	
	private ServerSocket server=null;
	private Socket socket=null;
	private DataInputStream input=null;
	
	public Server_Connection(int port)
	{
		try {
			server=new ServerSocket(port);
			 System.out.println("Server started");
			 
	        System.out.println("Waiting for a client ...");
			socket=server.accept();
			System.out.println("Accepted !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			input =new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String line = "";
		 
        // reads message from client until "Over" is sent
        while (!line.equals("Over"))
        {
            try
            {
                line = input.readUTF();
                System.out.println(line);

            }
            catch(IOException i)
            {
                System.out.println(i);
            }
        }
        System.out.println("Closing connection");

        // close connection
        try {
        	
        socket.close();
        input.close();
    }
    catch(IOException i)
    {
        System.out.println(i);
    }
}

public static void main(String args[])
{
	Server_Connection server = new Server_Connection(5000);
}

	}


