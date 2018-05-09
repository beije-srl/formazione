package it.beije.testweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet{
	//la classe HttpServlet se non sono implementati get e post va in errore
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		System.out.println("RICHIESTA RICEVUTA!!");
		String queryString = req.getQueryString();
		
		// "q=1234"
		String[] parametri = queryString.split("=");
		
		String valoreParametro = parametri[1];
		
		if (valoreParametro.equals("patate")){
			resp.getWriter().append("<h1>LE PATATE SONO BUONE!!</h1>");
		}
		else {
			resp.getWriter().append("<h1>IL RESTO FA SCHIFO!!</h1>");
		}
	}
}
