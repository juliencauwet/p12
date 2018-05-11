package fr.greenwin.voixlibre.repositories;

import fr.greenwin.voixlibre.entities.Option;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends CrudRepository<Option, Integer> {

    List<Option> findOptionsByProject_Id(int id);
}
