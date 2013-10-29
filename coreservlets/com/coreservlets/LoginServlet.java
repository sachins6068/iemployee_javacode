package com.coreservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.services.LoginService;
import com.srcdto.Credentials;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Credentials creds=new Credentials();
    LoginService loginserv=new LoginService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//System.out.print(request.getParameter("username"));
		//System.out.print(request.getParameter("password"));
		creds.setUsername(request.getParameter("username"));
		creds.setPassword(request.getParameter("password"));
		String usertype=loginserv.Authenticate(creds);
		if(usertype!=null)
		{
			request.setAttribute("authenticationmsg", "");
			if(usertype.equalsIgnoreCase("employee")){
				System.out.println(creds.getUsername());
				request.setAttribute("empid",creds.getUsername());
				request.getRequestDispatcher("emphome.jsp").forward(request, response);
				
			}
			else if(usertype.equalsIgnoreCase("admin"))
			{
				request.getRequestDispatcher("adminhome.jsp").forward(request, response);	
			}
			//request.setAttribute("custnum", "301");
			//System.out.print("succs");
			
		}
		else{
			request.setAttribute("authenticationmsg", "Incorrect Details");
			//System.out.print("fails");
			//response.sendRedirect(arg0);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

}
