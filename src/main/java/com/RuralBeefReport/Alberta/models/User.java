package com.RuralBeefReport.Alberta.models;

import javax.persistence.*;
import java.util.List;

@Entity(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER,orphanRemoval = true)
    private List<Authority> authorities;


    public User(){}
    public User(String username,String email,String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    //GETTERS
    public String getUsername(){
        return this.username;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }

    //SETTERS
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
