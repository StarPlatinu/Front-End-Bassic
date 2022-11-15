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
import model.Record;
import model.Record;

/**
 *
 * @author Le Hong Quan
 */
public class RecordDAO extends DBContext {

    List<Record> getAllByEid(int eid) {
        try {
            List<Record> list = new ArrayList<>();
            //mo ket noi
            String sql = "select * from Record where eid = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, eid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Record record = new Record(rs.getInt(1), rs.getString(2), rs.getInt(3));
                list.add(record);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public void save(int eid, String recordContent) {
        try {
            //mo ket noi
            String sql = "INSERT INTO [dbo].[Record]\n"
                    + "           ([content]\n"
                    + "           ,[eid])\n"
                    + "     VALUES\n"
                    + "           (?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, recordContent);
            ps.setInt(2, eid);
            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

}
