package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Person.PersonDetails;
import daoInter.PersondaoInter;
import serviceInter.Serviceinter;
@Component
public class PersonServiceImpl implements Serviceinter{
	@Autowired
	PersondaoInter persondaoInter;

	@Override
	public void insertdat(PersonDetails p) {
		persondaoInter.insert(p);
		//persondaoTnter.
	}

	

	public void setPersondaoInter(PersondaoInter persondaoInter) {
		this.persondaoInter = persondaoInter;
	}
	 

}
