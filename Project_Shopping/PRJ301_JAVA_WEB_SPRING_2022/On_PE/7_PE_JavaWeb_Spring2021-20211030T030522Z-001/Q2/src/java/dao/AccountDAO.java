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
import model.Account;
import model.Account;

/**
 *
 * @author Le Hong Quan
 */
public class AccountDAO extends DBContext {

    public Account login(String accountId, String password) {
        try {
            //mo ket noi
            String sql = "select * from Account where accountid = ? and password = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, accountId);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Account account = new Account(rs.getString(1), rs.getString(2));
                return account;
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

}
