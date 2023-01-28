package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;




public class Firstclass {
	public static void main(String[] args) throws Exception {
		final ServerSocket server = new ServerSocket(8080);
		System.out.println("listening For Connection on port 8080....");
		while(true) {
			try(Socket client = server.accept()){
				Date today = new Date();
				String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today +" Abdou Created his first server";
				client.getOutputStream().write(httpResponse.getBytes("UTF-8"));
			}
			
		}
	}
}
