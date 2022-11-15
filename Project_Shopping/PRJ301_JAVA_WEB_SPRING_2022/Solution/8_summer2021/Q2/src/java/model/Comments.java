/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author win
 */
public class Comments {

    private int commentId;
    private int entryId;
    private String commentContent;
    private String dateCreated;
    private String dateModified;

    public Comments() {
    }

    public Comments(int commentId, int entryId, String commentContent, String dateCreated, String dateModified) {
        this.commentId = commentId;
        this.entryId = entryId;
        this.commentContent = commentContent;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }
    
}
