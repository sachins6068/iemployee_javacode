package com.coreservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.services.EmployeeInfoService;
import com.srcdto.EmployeeInfo;
/**
 * Servlet implementation class EmployeeInfoServlet
 */
public class EmployeeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeInfoService empinfoservice=new EmployeeInfoService();
	EmployeeInfo empinfo=new EmployeeInfo();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println(request.getParameter("empid"));
		empinfoservice.EmpDetails(empinfo,request.getParameter("empid"));
		request.setAttribute("empinfo", empinfo);
		request.getRequestDispatcher("empinfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
