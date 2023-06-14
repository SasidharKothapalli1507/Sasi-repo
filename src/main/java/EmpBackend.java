import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/EmpBackend")
public class EmpBackend extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("Name");
		String temp =req.getParameter("Sal");
		int sal=Integer.parseInt(temp);
		oyeedetails values(?,?)";
		
		
	}

	
	}

}
