package fr.greenwin.voixlibre.services;

import fr.greenwin.voixlibre.entities.ProjectCategory;
import fr.greenwin.voixlibre.repositories.ProjectCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectCategoryService {

    @Autowired
    ProjectCategoryRepository projectCategoryRepository;

    public void addProjectCategory(ProjectCategory projectCategory){
        projectCategoryRepository.save(projectCategory);
    }

    public List<ProjectCategory> getAllProjectCategories(){
        List<ProjectCategory> projectCategories = new ArrayList<>();
        projectCategoryRepository.findAll().forEach(projectCategories::add);
        return projectCategories;
    }
}
