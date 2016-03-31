package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	PersonRepository personRepository;
	
	@RequestMapping(value="/peopleList", method=RequestMethod.GET)
	public List<Person> getPeople(){
		List<Person> list = new ArrayList<>();
		for (Person p : personRepository.findAll()){
			list.add(p);
		}
		return 	list;//personRepository.findByLastName("Landa");
	}
}
