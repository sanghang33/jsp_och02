package och02Git;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	 * 개인정보 이름 : 김유신3 
	 * 아이디 : bb 
	 * 암호 : 1 
	 * 성별 : 남자
	 * 수신메일 : 공지 배송 
	 * 직업 : 장군
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String job[] = request.getParameterValues("job");
		String mail[]=request.getParameterValues("mail");
		String gender[]=request.getParameterValues("gender");
		/*
		 * String mail[] =request.getParameterValues("mail");
		 */		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><h1>개인정보</h1><body>");
		out.println("이름:"+name+"<br>");
		out.println("아이디:"+id+"<br>");
		out.println("암호:"+password+"<br>");
		for (int g = 0; g < gender.length; g++) {
			out.println("성별:"+gender[g]+"<br>");
		}
		out.println("수신 메일:");
		for(int j=0; j < mail.length;j++){
			out.println(mail[j]);
		}
		out.println("<br>");
		for(int i=0; i < job.length;i++){
			out.println("직업:"+job[i]+"<br>");
		}	
		out.close();
		


	}

}
