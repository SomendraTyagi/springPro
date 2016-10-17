package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import Person.PersonDetails;
import serviceInter.Serviceinter;

@Controller
public class SecondController {
	


	
	@Autowired
	Serviceinter ps;
	
	@RequestMapping(value = "/hellore", method = RequestMethod.GET)
	public String Second(PersonDetails p)	
	{
	
	ps.insertdat(p);
     return "hellore";

}
}