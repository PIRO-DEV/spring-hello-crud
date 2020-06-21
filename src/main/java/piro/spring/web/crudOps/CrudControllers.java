package piro.spring.web.crudOps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import piro.spring.web.models.Hello;
import piro.spring.web.models.helloService;


@RestController
public class CrudControllers {
	
	@Autowired
	private helloService hService;
	
	@RequestMapping("/hello")
	public List<Hello> helloMapping() {
		return hService.sendAllObjects();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/hello")
	public void getExampleObj(@RequestBody Hello example)
	{
		hService.setExampleObject(example);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/hello/{id}")
	public void deleteObject(@PathVariable int id)
	{
		hService.deleteObject(id);
	}

}
