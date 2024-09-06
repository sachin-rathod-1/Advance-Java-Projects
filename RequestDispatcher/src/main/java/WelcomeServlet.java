

import java.io.*;  
  
public class WelcomeServlet extends HttpServlet {  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String name=request.getParameter("userName");  
    out.print("Welcome "+name);
    out.print("<input type= \"submit\" value=\"Logout\"/>");
    RequestDispatcher rd=request.getRequestDispatcher("byebye");  
    rd.forward(request, response); 
    }  
  
}  

