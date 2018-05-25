package it.beije.formazione.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.beije.formazione.dao.TravelPlannerDao;

@RequestMapping("/travel")
public class TravelPlannerControler{
	
	
	private TravelPlannerDao dao;
	
//	@RequestMapping(value="/hello", method=RequestMethod.GET)
//	public String helloWorld(){
//		return "hello";
	
		
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("user") String username, @RequestParam("pass") String password, ModelMap attributo) throws SQLException{
		System.out.println("User: " + username + " Password: "+ password);
		attributo.addAttribute("nome",username);
		
		if((dao.ritorna(username).equals("true")))
			return "hello";
		else
			return "errore";
	}

	public TravelPlannerDao getDao() {
		return dao;
	}

	public void setDao(TravelPlannerDao dao) {
		this.dao = dao;
	}

}
