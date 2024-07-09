package H2trail.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import H2trail.Entity.h2table;

public interface h2trailRepository extends JpaRepository<h2table,Long>
{
	

}
