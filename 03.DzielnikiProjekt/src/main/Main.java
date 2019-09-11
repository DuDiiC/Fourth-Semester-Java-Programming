package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dzielniki")
public class Main extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		PrintWriter printWriter = resp.getWriter();
//		printWriter.println("<h1>Lista dzielników:</h1>");
		
		Integer num = Integer.parseInt(req.getParameter("num"));
		
		List<Integer> numList = new ArrayList<>();
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				numList.add(i);
			}
		}
		
		req.setAttribute("list", numList);
		req.setAttribute("num", num);
		req.getRequestDispatcher("/WEB-INF/dzielniki.jsp").forward(req, resp);
	}

}
