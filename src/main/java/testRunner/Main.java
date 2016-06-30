package testRunner;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class Main {

	public static void main(String[] args) {
	
		
		HttpServletRequest req = new BessemRequest();
		
		HttpServletResponse resp = null ;
		
		try {
			
			
			new TestServlet().doGet(req, resp);
			
			
			
			
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
