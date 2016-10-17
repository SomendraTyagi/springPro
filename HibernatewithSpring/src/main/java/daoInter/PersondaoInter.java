package daoInter;

import org.springframework.stereotype.Repository;

import Person.PersonDetails;

@Repository
public interface PersondaoInter {
	public void insert(PersonDetails person);

}
