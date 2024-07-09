package H2trail.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import H2trail.Entity.h2table;
import H2trail.Service.H2trailService;

@RestController
@RequestMapping("/api")
public class h2trailcontroller 
{
	@Autowired
	private H2trailService h2trailservice;
	
	@GetMapping("/get/{id}")
	public h2table fetchbyid(@PathVariable Long id)
	{
		return h2trailservice.fetchbyid(id);
	}

}
