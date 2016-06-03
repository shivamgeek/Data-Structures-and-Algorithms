package testSockets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
 
public class Client
{
 
    private static Socket socket;
 
    public static void main(String args[]) throws IOException, InterruptedException
    {
        
            String host = "www.google.com";
            int port = 25000;
            InetAddress address = InetAddress.getByName(host);
            System.out.println("trying to connect to "+address);
           socket = new Socket(address, port);
            System.out.println("trying to connect");
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
 
         /*   String number = "14";
 
            String sendMessage = number + "\n";
            bw.write(sendMessage);   //WRITE
            bw.flush();
            System.out.println("C: Message sent to the server : "+sendMessage);
            Thread.sleep(10000);
 
            //Get the return mSessage from the server
           */
          //  System.out.println("trying to connect");
            String message = br.readLine();    //READ
            System.out.println("C: Message received from the server : " +message);
        
        
           
    }
}