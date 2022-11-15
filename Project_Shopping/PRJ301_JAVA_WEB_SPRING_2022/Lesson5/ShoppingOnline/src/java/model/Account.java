/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Le Hong Quan
 */
@Builder
@Getter
@Setter
@ToString
public class Account {

    public static final String ADMIN = "ADMIN";
    public static final String USER = "USER";
    private int id;
    private String username;
    private String password;
    private String displayName;
    private String address;
    private String email;
    private String phone;
    private String role;
}
