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
import model.Department;
import model.Employee;

/**
 *
 * @author Le Hong Quan
 */
public class EmployeeDAO {

    public List<Employee> getAll() {
        try {
            List<Employee> list = new ArrayList<>();
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "select e.*,d.dname from Employees e inner join Departments d\n"
                    + "on e.did = d.did";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getBoolean(4),
                        new Department(rs.getInt(5), rs.getString(6)));
                list.add(employee);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public List<Employee> getAllByDid(int did) {
        try {
            List<Employee> list = new ArrayList<>();
            //mo ket noi
            Connection conn = new DBContext().getConnection();
            String sql = "select e.*,d.dname from Employees e inner join Departments d\n"
                    + "on e.did = d.did where d.did = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, did);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getBoolean(4),
                        new Department(rs.getInt(5), rs.getString(6)));
                list.add(employee);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

}
