/**
 * 
 */
package Controller;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import Person.PersonDetails;
import controler.SecondController;
import junit.framework.TestCase;
import serviceInter.Serviceinter;

/**
 * @author Oct 17, 2016, Somendra
    
 *
 */


@RunWith(MockitoJUnitRunner.class)
public class SecondControllerTest extends TestCase {

	/**
	 * Test method for {@link controler.SecondController#Second(Person.PersonDetails)}.
	 */
	
	
	@InjectMocks
	SecondController secondController ;
	@Mock		
	Serviceinter ps;
	PersonDetails p= new PersonDetails();
	
	@Before
	public void  before()
	{
      p.setName("hello");
		p.setRollno(1111);
		
	}
	@Test
	public void testSecond() {
		//ModelAndView ktest= new ModelAndView("hellore");
	      
		assertEquals("hellore", secondController.Second(p));
		verify(ps,times(1)).insertdat(p);
		
		
	}

}
