package fr.greenwin.voixlibre.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class ProjectCategory {

    @Id
    @GeneratedValue
    int id;

    @NotNull
    @Size(min = 3, max = 50)
    String name;

    public ProjectCategory(@NotNull @Size(min = 3, max = 50) String name) {
        this.name = name;
    }

    public ProjectCategory() {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
