package com.pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	
	public static void main(String args[]) throws IOException, InterruptedException{
	
		ServerSocket soc=new ServerSocket(20456);
		System.out.println("SERVER : "+"Server started and waiting for connections");
		
		Socket s=soc.accept();
		
		InputStream is=s.getInputStream();
		InputStreamReader ir=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(ir);

		OutputStream op=s.getOutputStream(); 
		OutputStreamWriter or=new OutputStreamWriter(op);
		BufferedWriter bw=new BufferedWriter(or);
		
		System.out.println("SERVER : "+"Client connected");
		System.out.println("SERVER : "+"Waiting for client Message");
		String msg=br.readLine();
		System.out.println("SERVER : "+"Got Client message");
		System.out.println("SERVER : Message is - "+msg);
		
		
		bw.write(" server writing\n");
		System.out.println("SERVER : "+"NEW data sent to client");
		bw.flush();
		
		
		
	}
	

}
