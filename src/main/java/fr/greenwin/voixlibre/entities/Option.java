package fr.greenwin.voixlibre.entities;

import javax.persistence.*;

@Entity
public class Option {

    @Id
    @GeneratedValue
    private int id;

    private String nom;

    @ManyToOne(cascade = CascadeType.ALL)
    private Project project;

    private static int nbVotes = 0;

    public Option(){

    }

    public Option(String nom) {
        this.nom = nom;
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
