package testSockets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server
{
 
    private static Socket socket;
 
    public static void main(String[] args) throws IOException, InterruptedException
    {
        

            ServerSocket serverSocket = new ServerSocket(25000);
            System.out.println("S: Server Started and listening to the port 25000");
            	socket = serverSocket.accept();
            	
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                String number = br.readLine();   //READ 
                System.out.println("S: Message received from client is "+number);
                Thread.sleep(10000);
                String returnMessage;
                int numberInIntFormat = Integer.parseInt(number);
                int returnValue = numberInIntFormat*2;
                returnMessage = String.valueOf(returnValue) + "\n";
               

               
                bw.write(returnMessage);    //WRITE
                System.out.println("S: Message sent to the client is "+returnMessage);
                bw.flush();
            
       
       
                
    }        
}
