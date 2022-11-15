/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.CharacterModel;

/**
 *
 * @author Le Hong Quan
 */
public class CharacterDAO {

    public void addCharacter(String cid, String name, boolean gender) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "INSERT INTO [dbo].[Characters]\n"
                    + "           ([cid]\n"
                    + "           ,[name]\n"
                    + "           ,[gender]\n"
                    + "           ,[created_date])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,getDate())";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cid);
            ps.setString(2, name);
            ps.setBoolean(3, gender);
            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void addCharacterSkill(String cid, String[] skills) {
        try {
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "INSERT INTO [dbo].[Character_Skill]\n"
                    + "           ([cid]\n"
                    + "           ,[sid])\n"
                    + "     VALUES\n"
                    + "           (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            for (String skill : skills) {
                ps.setString(1, cid);
                ps.setInt(2, Integer.parseInt(skill));
                ps.executeUpdate();
            }

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

}
