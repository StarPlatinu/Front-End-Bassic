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
public class Event {

    private int id;
    private String content;
    private Date date;
    private boolean isEnable;
    private String createdBy;
    private List<Record> records;

    public Event() {
    }

    public Event(int id, String content, Date date, boolean isEnable, String createdBy) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.isEnable = isEnable;
        this.createdBy = createdBy;
    }

    public Event(int id, String content, Date date, boolean isEnable, String createdBy, List<Record> records) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.isEnable = isEnable;
        this.createdBy = createdBy;
        this.records = records;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsEnable() {
        return isEnable;
    }

    public void setIsEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

}
