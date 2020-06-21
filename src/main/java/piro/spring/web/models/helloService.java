package piro.spring.web.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class helloService {
	
	@Autowired
	private crudInterface ci;
	
	public void setExampleObject(Hello e) {
		ci.save(e);
	}
	
	public List<Hello> sendAllObjects() {
		List<Hello> exp = new ArrayList<Hello>();
		ci.findAll().forEach(exp::add);
		return exp;
	}
	
	public void deleteObject(int id) {
		ci.deleteById(id);
	}

	
}
