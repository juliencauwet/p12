package fr.greenwin.voixlibre.services;

import fr.greenwin.voixlibre.entities.AppUser;
import fr.greenwin.voixlibre.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserService {

    @Autowired
    AppUserRepository appUserRepository;

    public void addAppUser(AppUser appUser){
        appUserRepository.save(appUser);
    }

    public List<AppUser> getAllAppUsers(){
        List<AppUser> appUsers = new ArrayList<>();
        appUserRepository.findAll().forEach(appUsers::add);
        return appUsers;
    }
}
