/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Comments;
import model.Comments;

/**
 *
 * @author win
 */
public class CommentDAO extends DBContext {

    public List<Comments> getCommentsByentryId(int entryId) {
        try {
            List<Comments> list = new ArrayList<>();
            String sql = "select * from Comments where EntryID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, entryId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comments comments = new Comments(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));

                list.add(comments);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public void remove(int commentId) {
        try {
            String sql = "DELETE FROM [dbo].[Comments]\n"
                    + "      WHERE CommentID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, commentId);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

}
