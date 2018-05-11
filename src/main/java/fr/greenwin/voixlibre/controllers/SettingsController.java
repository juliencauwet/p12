package fr.greenwin.voixlibre.controllers;

import fr.greenwin.voixlibre.entities.AppUser;
import fr.greenwin.voixlibre.entities.ProjectCategory;
import fr.greenwin.voixlibre.services.AppUserService;
import fr.greenwin.voixlibre.services.ProjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/settings")
@Controller
public class SettingsController {

    @Autowired
    ProjectCategoryService projectCategoryService;

    @GetMapping
    public String  settings(){

        return "settings";
    }

    @PostMapping
    public String newSettings(@ModelAttribute ProjectCategory category, Model model) {

        projectCategoryService.addProjectCategory(category);
        model.addAttribute("message", "La catégorie " + category + " a bien été enregistrée.");

        return "settings";
    }

}
