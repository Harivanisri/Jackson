package H2trail.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import H2trail.Entity.h2table;
import H2trail.Repository.h2trailRepository;

@Service
public class H2trailService 
{
	@Autowired
	private h2trailRepository h2trailrepository;
	
    public h2table fetchbyid( Long id)
    {
    	return h2trailrepository.findById(id).get();
    }

}
