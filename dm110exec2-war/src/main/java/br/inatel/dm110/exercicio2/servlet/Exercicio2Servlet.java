package br.inatel.dm110.exercicio2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exercicio2")
public class Exercicio2Servlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
			 response.setContentType("text/html");
			 PrintWriter out = response.getWriter();
			 out.println("<h1>Exercicio 2 DM110</h1>");
		}
}