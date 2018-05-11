package fr.greenwin.voixlibre.services;

import fr.greenwin.voixlibre.entities.Option;
import fr.greenwin.voixlibre.repositories.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {

    @Autowired
    OptionRepository optionRepository;

    public void addOption(Option option){
        optionRepository.save(option);
    }

    public List<Option> getOptionsByProjectId(int id){
        return optionRepository.findOptionsByProject_Id(id);
    }
}
