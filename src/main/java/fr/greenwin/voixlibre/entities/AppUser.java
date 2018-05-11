package fr.greenwin.voixlibre.entities;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AppUser {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 2, max = 100)
    private String nom;

    @NotNull
    @Size(min = 2, max = 100)
    private String prenom;

    @Column(name="photo_blob")
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] photoBlob;

    @Column(name = "photo_content_length")
    private Integer photoContentLength;

    @Column(name = "photo_content_type", length = 50)
    private String photoContentType;

    @NotNull
    @Size(min = 2, max = 200)
    private String rue;
    @NotNull
    @Size(min = 1, max = 20)
    private String num;

    @OneToMany
    @JoinColumn(name = "project_id")
    private Set<Project> projects = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "vote_id")
    private Set<Vote> votes = new HashSet<>();

    private String email;

    private String password;

    private String naissance;

    private Boolean isAdmin = false ;

    public AppUser(@NotNull @Size(min = 2, max = 100) String nom, @NotNull @Size(min = 2, max = 100) String prenom, @NotNull @Size(min = 2, max = 200) String rue, @NotNull @Size(min = 1, max = 20) String num, String email, String password, String naissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.num = num;
        this.email = email;
        this.password = password;
        this.naissance = naissance;
        this.projects = projects;
    }

    public AppUser(){

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNaissance() {
        return naissance;
    }

    public void setNaissance(String naissance) {
        this.naissance = naissance;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public byte[] getPhotoBlob() {
        return photoBlob;
    }

    public void setPhotoBlob(byte[] photoBlob) {
        this.photoBlob = photoBlob;
    }

    public Integer getPhotoContentLength() {
        return photoContentLength;
    }

    public void setPhotoContentLength(Integer photoContentLength) {
        this.photoContentLength = photoContentLength;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }
}
