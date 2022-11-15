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
import model.Event;
import model.Record;

/**
 *
 * @author Le Hong Quan
 */
public class EventDAO extends DBContext {

    public List<Event> getAllEnable(String createdBy) {
        try {
            List<Event> list = new ArrayList<>();
            //mo ket noi
            String sql = "select * from Event where created_by = ? and isEnable =1";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, createdBy);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Event event = new Event(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4), rs.getString(5));
                list.add(event);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<Event> getAll() {
        try {
            List<Event> list = new ArrayList<>();
            //mo ket noi
            String sql = "select * from Event";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                List<Record> listRecords = new RecordDAO().getAllByEid(rs.getInt(1));
                Event event = new Event(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4), rs.getString(5), listRecords);
                list.add(event);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

}
