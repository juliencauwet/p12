package fr.greenwin.voixlibre.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Option {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String nom;

    @ManyToOne(cascade = CascadeType.ALL)
    private Project project;

    private static int nbVotes = 0;

    public Option(){

    }

    public Option(@NotNull String nom, Project project) {
        this.nom = nom;
        this.project = project;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static int getNbVotes() {
        return nbVotes;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

}
