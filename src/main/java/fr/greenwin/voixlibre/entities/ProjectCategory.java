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
    String category;

    public ProjectCategory(@NotNull @Size(min = 3, max = 50) String category) {
        this.category = category;
    }

    public ProjectCategory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
