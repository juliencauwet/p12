package fr.greenwin.voixlibre.controllers;

import fr.greenwin.voixlibre.entities.AppUser;
import fr.greenwin.voixlibre.entities.Option;
import fr.greenwin.voixlibre.entities.Project;
import fr.greenwin.voixlibre.entities.ProjectCategory;
import fr.greenwin.voixlibre.services.AppUserService;
import fr.greenwin.voixlibre.services.OptionService;
import fr.greenwin.voixlibre.services.ProjectCategoryService;
import fr.greenwin.voixlibre.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    AppUserService appUserService;

    @Autowired
    ProjectService projectService;

    @Autowired
    ProjectCategoryService projectCategoryService;

    @Autowired
    OptionService optionService;

    @GetMapping("/")
    public String  home(){

        return "index";
    }

    @GetMapping("/fixture")
    public String addFixture(){
        AppUser au1 = new AppUser("Cauwet", "Julien", "rue Edouard Thouvenel", "7", "juliencauwet@yahoo.fr", "19471947", "04/26/1981");
        AppUser au2 = new AppUser("Favre-Victoire", "Emmanuel", "Bd Carnot", "20", "efvviv@gmail.com", "antibes2020", "08/08/1966");
        AppUser au3 = new AppUser("Dupont", "Albert", "avenue des Champs elysées", "20", "ad@gmail.com", "an2020", "08/08/1934");
        au1.setAdmin(true);
        au2.setAdmin(true);

        appUserService.addAppUser(au1);
        appUserService.addAppUser(au2);
        appUserService.addAppUser(au3);

        ProjectCategory pc1 = new ProjectCategory("aménagement du territoire");
        ProjectCategory pc2 = new ProjectCategory("éducation");
        ProjectCategory pc3 = new ProjectCategory("tourisme");

        projectCategoryService.addProjectCategory(pc1);
        projectCategoryService.addProjectCategory(pc2);
        projectCategoryService.addProjectCategory(pc3);

        Project p1 = new Project("Parking lac",pc1, au1, "Lot de plusieurs parking le long du lac", "2018-05-10", "2018-06-10");
        Project p2 = new Project("université", pc2, au2, "Campus universitaire de droit, d'économie et de science", "2018-05-10", "2018-06-10");

        projectService.addProject(p1);
        projectService.addProject(p2);

        Option o1 = new Option("oui", p1);
        Option o2 = new Option("non", p1);
        Option o3 = new Option("place des Arts", p2);
        Option o4 = new Option("devant la Capitainerie", p2);
        Option o5 = new Option("Boulevard Carnot", p2);
        Option o6 = new Option("dans le château de Ripaille", p2);

        optionService.addOption(o1);
        optionService.addOption(o2);
        optionService.addOption(o3);
        optionService.addOption(o4);
        optionService.addOption(o5);
        optionService.addOption(o6);

        return "index";
    }



}
