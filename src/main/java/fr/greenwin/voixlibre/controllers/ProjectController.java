package fr.greenwin.voixlibre.controllers;

import fr.greenwin.voixlibre.entities.Project;
import fr.greenwin.voixlibre.services.AppUserService;
import fr.greenwin.voixlibre.services.ProjectCategoryService;
import fr.greenwin.voixlibre.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequestMapping("/projects")
@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private AppUserService appUserService;

    @Autowired
    private ProjectCategoryService projectCategoryService;


    @GetMapping
    public String listOfProjects(Model model){

        model.addAttribute("projects", projectService.getAllProjects());

        return "projects/projectlist";
    }

    @GetMapping("/form")
    public String displayNewProjectForm(Model model){
        model.addAttribute("appUsers", appUserService.getAllAppUsers());
        model.addAttribute("categories", projectCategoryService.getAllProjectCategories());
        return "projects/form";
    }

    @PostMapping("/form")
    public void addProject(@ModelAttribute Project newProject, Model model, @RequestBody MultipartFile file,
                           RedirectAttributes redirectAttributes){

        try {
            projectService.addProject(newProject);
        }catch (Exception e){
            model.addAttribute("erreur", "Un ou plusieurs champs ont été mal renseignés.");
        }


    }

    @GetMapping("/{id}")
    public String displayProjectDescription(Model model, @PathVariable int id){

        Project project = projectService.getProject(id);
        model.addAttribute("project", project);

        return "projects/projectdescription";
    }

}
