package fr.greenwin.voixlibre.repositories;

import fr.greenwin.voixlibre.entities.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {

    Project findById(int id);
}
