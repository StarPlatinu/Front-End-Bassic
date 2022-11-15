/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Department;
import model.Employee;

/**
 *
 * @author sonnt
 */
public class EmployeeDAO extends DBContext {

    public ArrayList<Employee> search(Integer id, String name, Boolean gender,
            Date from, Date to, int did) {
        ArrayList<Employee> emps = new ArrayList<>();
        String sql = "SELECT e.id,e.name,e.gender,e.dob,d.id as did, d.name as dname\n"
                + "FROM Employees e INNER JOIN Departments d\n"
                + "ON e.did = d.id WHERE 1 = 1";

        HashMap<Integer, Object[]> params = new HashMap<>();
        Integer index = 0;

        if (id != null) {
            sql += " AND e.id = ?";
            index++;
            Object[] param = new Object[2];
            param[0] = "INT";
            param[1] = id;
            params.put(index, param);
        }
        if (name != null && !name.equals("")) {
            sql += " AND e.name = ?";
            index++;
            Object[] param = new Object[2];
            param[0] = "STRING";
            param[1] = name;
            params.put(index, param);
        }
        if (gender != null) {
            sql += " AND e.gender = ?";
            index++;
            Object[] param = new Object[2];
            param[0] = "BOOLEAN";
            param[1] = gender;
            params.put(index, param);
        }
        if (from != null) {
            sql += " AND e.dob >= ?";
            index++;
            Object[] param = new Object[2];
            param[0] = "DATE";
            param[1] = from;
            params.put(index, param);
        }
        if (to != null) {
            sql += " AND e.dob <= ?";
            index++;
            Object[] param = new Object[2];
            param[0] = "DATE";
            param[1] = to;
            params.put(index, param);
        }
        if (did > 0) {
            sql += " AND d.id = ?";
            index++;
            Object[] param = new Object[2];
            param[0] = "INT";
            param[1] = did;
            params.put(index, param);
        }

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for (Map.Entry<Integer, Object[]> entry : params.entrySet()) {
                Integer key = entry.getKey();
                Object[] value = entry.getValue();
                switch (value[0].toString()) {
                    case "INT":
                        ps.setInt(key, (int) value[1]);
                        break;
                    case "STRING":
                        ps.setString(key, value[1].toString());
                        break;
                    case "BOOLEAN":
                        ps.setBoolean(key, (boolean) value[1]);
                        break;
                    case "DATE":
                        ps.setDate(key, (Date) value[1]);
                        break;
                }
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Department d = new Department();
                d.setId(rs.getInt("did"));
                d.setName(rs.getString("dname"));
                Employee e = new Employee();
                e.setDept(d);
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setGender(rs.getBoolean("gender"));
                e.setDob(rs.getDate("dob"));
                emps.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return emps;
    }
}
