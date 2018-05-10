package fr.greenwin.voixlibre.services;

import fr.greenwin.voixlibre.entities.Project;
import fr.greenwin.voixlibre.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public void addProject(Project project) {
        projectRepository.save(project);
    }

    public List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<>();
        projectRepository.findAll().forEach(projects::add);
        return projects;
    }

    public Project getProject(int id) {
        return projectRepository.findById(id);
    }

}
