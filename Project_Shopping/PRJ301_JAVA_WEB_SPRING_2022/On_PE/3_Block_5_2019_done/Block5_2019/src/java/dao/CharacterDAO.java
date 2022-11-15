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
import model.Skill;

/**
 *
 * @author Le Hong Quan
 */
public class CharacterDAO {

    public List<CharacterModel> getAll() {
        try {
            List<CharacterModel> list = new ArrayList<>();
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "select * from Characters";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                List<Skill> listSkills = new SkillDAO().getSkillsByCid(rs.getString(1));
                CharacterModel characterModel = new CharacterModel(rs.getString(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4), listSkills);
                list.add(characterModel);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
    
}
