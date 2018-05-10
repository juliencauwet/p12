package fr.greenwin.voixlibre.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Project {

    @Id
    @GeneratedValue
    int id;

    @Size(min=2, max = 250)
    @NotNull
    private String titre;

    @OneToOne
    private ProjectCategory category;

    @ManyToOne(cascade = CascadeType.ALL)
    private AppUser initiateur;

    private String description;
    private String debut;
    private String fin;

    private static int nbVotant;

    @OneToMany
    @JoinColumn(name = "option_id")
    private Set<Option> options = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "vote_id")
    private Set<Vote> votes = new HashSet<>();

    public Project(@Size(min = 2, max = 250) @NotNull String titre, ProjectCategory category, AppUser initiateur, String description, String debut, String fin) {
        this.titre = titre;
        this.category = category;
        this.initiateur = initiateur;
        this.description = description;
        this.debut = debut;
        this.fin = fin;
    }

    public Project() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public AppUser getInitiateur() {
        return initiateur;
    }

    public void setInitiateur(AppUser initiateur) {
        this.initiateur = initiateur;
    }

    public static int getNbVotant() {
        return nbVotant;
    }

    public static void setNbVotant(int nbVotant) {
        Project.nbVotant = nbVotant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public ProjectCategory getCategory() {
        return category;
    }

    public void setCategory(ProjectCategory category) {
        this.category = category;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }

    public Set<Vote> getVotes() {
        return votes;
    }

    public void setVotes(Set<Vote> votes) {
        this.votes = votes;
    }
}
