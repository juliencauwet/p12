package fr.greenwin.voixlibre.repositories;

import fr.greenwin.voixlibre.entities.ProjectCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectCategoryRepository extends CrudRepository<ProjectCategory, Integer> {
}
