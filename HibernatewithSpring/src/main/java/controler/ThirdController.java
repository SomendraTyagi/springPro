/**
 * 
 */
package controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import daoInter.sampleDto;

/**
 * @author Oct 17, 2016, Somendra
    
 *
 */
@RestController
@EnableWebMvc
public class ThirdController {

	@RequestMapping(value = "/locations", produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<sampleDto> getLocation(){
	System.out.println("inside locations");
	sampleDto sd = new sampleDto();
	sd.setName("copyright");
	sd.setRoll("738");
	return new ResponseEntity<sampleDto>(sd, HttpStatus.OK);		
	}
	
}
