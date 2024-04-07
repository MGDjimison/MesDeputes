package com.example.mesdeputes;

import androidx.annotation.Nullable;

import java.io.Serializable;

public class Deputy implements Serializable {

    private int id;
    private String firstname;
    private String lastname;
    private String department;
    private int numCirco;
    private String nameCirco;

    private String email;
    private String groupe;
    private String dateNaissance;
    private String lieuNaissance;
    private String organisme;

    public String getOrganisme() {
        return organisme;
    }

    public void setOrganisme(String organisme) {
        this.organisme = organisme;
    }

    public Deputy(int id, String firstname, String lastname, String department, int numCirco, String nameCirco, String dateNaissance, String lieuNaissance) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.numCirco = numCirco;
        this.nameCirco = nameCirco;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public Deputy(String dateNaissance, String lieuNaissance) {
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumCirco() {
        return numCirco;
    }

    public void setNumCirco(int numCirco) {
        this.numCirco = numCirco;
    }

    public String getNameCirco() {
        return nameCirco;
    }

    public void setNameCirco(String nameCirco) {
        this.nameCirco = nameCirco;
    }


    public String getNameForAvatar(){
        return firstname.replace(' ', '-').toLowerCase()+
                "-"+lastname.replace(' ', '-').toLowerCase();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        Deputy d= (Deputy) obj;
        return id==d.getId();
    }
}
