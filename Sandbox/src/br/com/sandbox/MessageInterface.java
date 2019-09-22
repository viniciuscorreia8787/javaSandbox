package br.com.sandbox;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.mq.samples.jms.JmsPutGet;



/****
 * @author vinic
 *
 *****/

@WebServlet(urlPatterns="/MessageInterface")
public class MessageInterface extends HttpServlet  {

	/**
	 * @param args
	 */
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get The Last Message from MQ
		String lastMessage = JmsPutGet.getMessage();
		PrintWriter writer = resp.getWriter();
		writer.println(lastMessage);
		
	} 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Put a message on MQ
		
		StringBuilder buffer = new StringBuilder();
		BufferedReader reader = req.getReader();
		String line;
		while ((line = reader.readLine()) != null) {
			buffer.append(line);
		}
		String requestBody = buffer.toString();		
		
		String messageReturned = JmsPutGet.putMessage(requestBody);
		PrintWriter writer = resp.getWriter();
		writer.println(messageReturned);		
		
	}

	
	

}
