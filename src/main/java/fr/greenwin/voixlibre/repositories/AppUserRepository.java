package fr.greenwin.voixlibre.repositories;

import fr.greenwin.voixlibre.entities.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {
}
