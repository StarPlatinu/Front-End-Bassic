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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author Le Hong Quan
 */
//Thao tác với bảng Student trong db
public class StudentDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        try {
            String sql = "select * from student";
            //Mở kết nối với sql server
            conn = new DBContext().getConnection();

            //Đưa câu sql vào prepareStatement 
            ps = conn.prepareStatement(sql);

            //Thực thi câu lệnh sql sẽ trả về result set
            rs = ps.executeQuery();

            //Lặp rs để lấy data
            while (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getInt(5));
                list.add(student);
            }

        } catch (Exception ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Student getStudentById(int id) {
        try {
            String sql = "select * from student where id =?";
            //Mở kết nối với sql server
            conn = new DBContext().getConnection();

            //Đưa câu sql vào prepareStatement 
            ps = conn.prepareStatement(sql);
            //set param
            ps.setInt(1, id);

            //Thực thi câu lệnh sql sẽ trả về result set
            rs = ps.executeQuery();

            //Lặp rs để lấy data
            while (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getInt(5));
                return student;
            }

        } catch (Exception ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //insert
    public void insert(Student student) {
        try {
            String sql = "INSERT INTO [dbo].[Student]\n"
                    + "           ([name]\n"
                    + "           ,[age]\n"
                    + "           ,[mark]\n"
                    + "           ,[classid])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?)";

            //Mở kết nối đến sql server
            conn = new DBContext().getConnection();

            //đưa câu lệnh sql vào prepare statement để chuẩn bị thực thi
            ps = conn.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setDouble(3, student.getMark());
            ps.setInt(4, student.getClassId());

            //Thực thi câu lệnh sql và trả về kết quả
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //update
    public void update(Student student) {
        try {
            String sql = "UPDATE [dbo].[Student]\n"
                    + "   SET [name] = ?\n"
                    + "      ,[age] = ?\n"
                    + "      ,[mark] = ?\n"
                    + "      ,[classid] = ?\n"
                    + " WHERE id=?";

            //Mở kết nối đến sql server
            conn = new DBContext().getConnection();

            //đưa câu lệnh sql vào prepare statement để chuẩn bị thực thi
            ps = conn.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setDouble(3, student.getMark());
            ps.setInt(4, student.getClassId());
            ps.setInt(5, student.getId());

            //Thực thi câu lệnh sql và trả về kết quả
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //delete
    public void delete(int id) {
        try {
            String sql = "DELETE FROM [dbo].[Student]\n"
                    + "      WHERE id=?";

            //Mở kết nối đến sql server
            conn = new DBContext().getConnection();

            //đưa câu lệnh sql vào prepare statement để chuẩn bị thực thi
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            //Thực thi câu lệnh sql và trả về kết quả
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
//        List<Student> list = studentDAO.getAllStudents();
//        for (Student student : list) {
//            System.out.println(student);
//        }

        Student student5 = studentDAO.getStudentById(5);
        System.out.println(student5.toString());
        Student student6 = studentDAO.getStudentById(6);
        System.out.println(student6.toString());

//        Student studentInsert = new Student(0, "Test create", 10, 5, 1);
//        studentDAO.insert(studentInsert);
//        Student studentUpdate = studentDAO.getStudentById(12);
//        studentUpdate.setName("Test update");
//        studentDAO.update(studentUpdate);
        studentDAO.delete(12);
    }

}
