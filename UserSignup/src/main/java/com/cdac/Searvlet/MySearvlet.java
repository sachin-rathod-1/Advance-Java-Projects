package com.cdac.Searvlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.cdac.Action.RegistrationAction;
import com.cdac.Beans.RegistrationBeans;
import com.cdac.Connections.MyConnections;

/**
 * Servlet implementation class MySearvlet
 */
@WebServlet("/MySearvlet")
@MultipartConfig(maxFileSize=16777215)
public class MySearvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MySearvlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String First_name,Last_name,Gender,Contact_no,Email_id,Password;
		String message;
	
		
		if(request.getParameter("Signup") != null) {
			First_name = request.getParameter("First_name");
			Last_name = request.getParameter("Last_name");
			Gender = request.getParameter("Gender");
			Contact_no =request.getParameter("Contact_no");
			Email_id = request.getParameter("Email_id");
			Password =request.getParameter("Password");
					
			InputStream inputStream=null;
			Part filePart=request.getPart("photo");
						
			RegistrationBeans rb =new RegistrationBeans();
			rb.setFirst_name(First_name);
			rb.setLast_name(Last_name);
			rb.setGender(Gender);
			rb.setContact_no(Contact_no);
			rb.setEmail_id(Email_id);
			rb.setPassword(Password);
			
			if(filePart!=null)
			{
				System.out.println("File Name:"+filePart.getName());
				System.out.println("File Size:"+filePart.getSize());
				System.out.println("File Content Type:"+filePart.getContentType());
				
				inputStream=filePart.getInputStream();
				rb.setInputStream(inputStream);
			}
			
			MyConnections mcon =new MyConnections();
			Connection con=mcon.config();			
			RegistrationAction ra=new RegistrationAction();
			int i=ra.Adduser(con, rb);

			if(i>0) 
				out.println(" <script>alert('User Added Succesfully')</script> ");
			else
				out.println(" <script>alert('No User Added')</script> ");
			
			
			
			
			
			
			
			
		}
		
		
	}

}
