package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lerform")
public class LerDadosFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LerDadosFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
			doPost(request, response);	
//		pw.println("<!DOCTYPE html>");
//		pw.println("<html>");
//		pw.println("<body>");
//		pw.println("<h1>Do GET !</h1>");
//		
//		pw.println();
//			
//		pw.println("</body>");
//		pw.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Do Post");
		
		PrintWriter pw = response.getWriter();
		
		request.getParameter("vlr1");
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Do POST !</h1>");
		
		pw.println(request.getParameter("vlr1"));
		pw.println("<br/>");
		pw.println(request.getParameter("vlr2"));
		pw.println("<br/>");
		pw.println(request.getParameter("vlr3"));
			
		pw.println("</body>");
		pw.println("</html>");
		
		
	}

}
