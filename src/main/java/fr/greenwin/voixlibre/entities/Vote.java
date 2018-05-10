package fr.greenwin.voixlibre.entities;


import javax.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private AppUser votant;

    @ManyToOne(cascade = CascadeType.ALL)
    private Project project;

    @OneToOne
    private Option option;

    public Vote(AppUser votant, Project project, Option option) {
        this.votant = votant;
        this.project = project;
        this.option = option;
    }

    public Vote(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AppUser getVotant() {
        return votant;
    }

    public void setVotant(AppUser votant) {
        this.votant = votant;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
