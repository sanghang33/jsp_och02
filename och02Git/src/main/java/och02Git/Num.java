package och02Git;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Num
 */
@WebServlet("/Num")
public class Num extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Num() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	 * 연산결과 덧셈 : 100 + 2 = 102 뺄셈 : 100 - 2 = 98 곱셈 : 100 * 2 = 200 나눗셈 : 100 / 2 =
	 * 50
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	
		response.setContentType("text/html;charset=utf-8");		
		PrintWriter out = response.getWriter();	
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		out.print("<body><h1>연산결과</h1><html>");
		out.println("덧셈:"+num1+"+"+num2+"="+(num1+num2)+"<br>");
		out.println("뺄셈:"+num1+"-"+num2+"="+(num1-num2)+"<br>");
		out.println("곱셈:"+num1+"*"+num2+"="+(num1*num2)+"<br>");
		out.println("나눗셈:"+num1+"/"+num2+"="+(num1/num2)+"<br>");
		out.printf("</html></body>");
		out.close();
		
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
