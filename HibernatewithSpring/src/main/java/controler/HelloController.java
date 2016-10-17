package controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
 
	
   @RequestMapping(value = "/hellor", method = RequestMethod.GET)
   public ModelAndView printHello() {
	  
	 
	   
   ModelAndView k = new ModelAndView("hello");
 

      return k;
   }

}