package och02Git;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.im.spi.InputMethod;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Date;



/**
 * Servlet implementation class Board
 */
@WebServlet("/Board")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * request.setCharacterEncoding("utf-8"); // TODO Auto-generated method stub
	 * //입력값을 return 목표 String title= request.getParameter("title"); String writer=
	 * request.getParameter("writer"); String date= request.getParameter("date");
	 * String content= request.getParameter("content");
	 * System.out.println("do Get String"+title);
	 * System.out.println("do Get String"+writer);
	 * System.out.println("do Get String"+date);
	 * System.out.println("do Get String"+content); //browser에 display하기 위한 방법
	 * response.setContentType("text/html;charset=utf-8"); //browser에 상새네용을 보여줌
	 * PrintWriter out = response.getWriter(); out.println("<html><body>");;
	 * //out.println("<h1>1부터 "+num+"까지 합계</h1>"); out.printf("<h1>제목:</h1>",title);
	 * out.printf("<h1>작성자:</h1>",writer); out.printf("<h1>작성일:</h1>",date);
	 * out.printf("<h1>내용</h1>",content); out.println("</body></html>");
	 * out.close();
	 * 
	 * }
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		//return 목표 
		String title= request.getParameter("title");
		String writer= request.getParameter("writer");
		String Date = request.getParameter("Date");
		String content= request.getParameter("content");
		
		Date now = new Date();
		
		//browser에 display하기 위한 방법 
		response.setContentType("text/html;charset=utf-8");
		//browser에 상세내용을 보여줌
		PrintWriter out = response.getWriter();
		out.println("<html><h1>게시판</h1><body>");;
		out.printf("<h4>제목: %s </h4>", title);
		out.printf("<h4>작성자: %s </h4>",writer);
		out.printf("<h4>작성일: %s </h4>", now.toString());	
		out.printf("<h4>내용</h4>",content);
		out.println(content);
		out.println("</body></html>");
		out.close();
	}

}
