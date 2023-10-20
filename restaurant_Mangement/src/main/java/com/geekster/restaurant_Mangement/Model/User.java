package com.geekster.restaurant_Mangement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String Email;

//    public User(String userName, String password, String email) {
//        this.userName = userName;
//        this.password = password;
//        Email = email;
//    }

}