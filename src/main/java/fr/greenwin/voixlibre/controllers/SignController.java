package fr.greenwin.voixlibre.controllers;

import fr.greenwin.voixlibre.entities.AppUser;
import fr.greenwin.voixlibre.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.RollbackException;

@RequestMapping("/sign")
@Controller
public class SignController {

    @Autowired
    AppUserService appUserService;

    @GetMapping
    public String  sign(){

        return "sign";
    }

    @PostMapping
    public void  signin(@ModelAttribute AppUser appUser, @RequestParam String password, Model model) {

        try {
            appUserService.addAppUser(appUser);
        } catch (Exception e) {
            model.addAttribute("Veuillez remplir les champs respectifs selon les règles");
            e.printStackTrace();
        }
    }

}
