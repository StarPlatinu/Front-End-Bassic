/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Le Hong Quan
 */
public class CharacterModel {
    private String cid;
    private String name;
    private boolean gender;
    private Date createdDate;
    private List<Skill> listSkills; //list skill cua Character nay

    public CharacterModel() {
    }

    public CharacterModel(String cid, String name, boolean gender, Date createdDate, List<Skill> listSkills) {
        this.cid = cid;
        this.name = name;
        this.gender = gender;
        this.createdDate = createdDate;
        this.listSkills = listSkills;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<Skill> getListSkills() {
        return listSkills;
    }

    public void setListSkills(List<Skill> listSkills) {
        this.listSkills = listSkills;
    }
    
    
    
    
}
