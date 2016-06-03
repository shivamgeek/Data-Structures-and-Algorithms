package com.pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
	
	public static void main(String args[]) throws UnknownHostException, IOException, InterruptedException{
		
		System.out.println("CLIENT : "+"Establishing connection with the server");
		Socket s=new Socket("localhost",20456);
		System.out.println("CLIENT : "+"connected to server, Check server tab");
		
		
		OutputStream op=s.getOutputStream();
		OutputStreamWriter ow=new OutputStreamWriter(op);
		BufferedWriter bw=new BufferedWriter(ow);
		InputStream is=s.getInputStream();
		InputStreamReader ir=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(ir);
		
		
		
		System.out.println("CLIENT : "+"sending server a message");
		bw.write("DATA 1\n");
		bw.flush();
		System.out.println("CLIENT : data 1 sent");
		
		Thread.sleep(5000);
		bw.write("DATA 2\n");
		System.out.println("CLIENT : data 2 sent");
		bw.flush();
		Thread.sleep(5000);
		System.out.println("CLIENT : "+"about to flush data");
		Thread.sleep(2000);
		bw.flush();
		

		String ss=br.readLine();
		System.out.println("CLIENT : server message is "+ss);
	    System.out.println("CLIENT : "+"closing connection");
	    //Thread.sleep(3000);
		s.close();
		
		
		
		
		
		
	}
	
	

}
