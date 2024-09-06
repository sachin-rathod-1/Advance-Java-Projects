

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class Login extends HttpServlet {  
	
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String name=request.getParameter("userName");  
    String passsword=request.getParameter("userPass");  
          
    if(passsword.equals("admin") && name.equals("admin")){  
        RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
        rd.forward(request, response);  
    }  
    else{  
        out.print("Sorry UserName or Password Error!");  
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
        rd.include(request, response);  
                      
        }  
    }  
  
}  