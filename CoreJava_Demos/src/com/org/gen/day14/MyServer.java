package com.org.gen.day14;

import java.io.IOException;
import java.net.ServerSocket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
 
public class MyServer {
 
    //initialize socket and input stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    // constructor with port
    public MyServer(int port)
    {
     try{
    server = new ServerSocket(port);
    System.out.println("Server started");
    System.out.println("Waiting for a client ...");
    socket = server.accept();
    System.out.println("Client accepted");
    in = new DataInputStream(
    new BufferedInputStream(socket.getInputStream()));
    String line = "";
    while (!line.equals("Over"))
    {
    try
    {
    line = in.readUTF();
    System.out.println(line);



    }
    catch(IOException i)
    {
    System.out.println(i);
    }
    }
    System.out.println("Closing connection");
    // close connection
    socket.close();
    in.close();
    }
    catch(IOException i){
    System.out.println(i);
    }
    }
    public static void main(String args[]){
    	MyServer server = new MyServer(8080);
    }
}
