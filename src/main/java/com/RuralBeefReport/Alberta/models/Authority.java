package com.RuralBeefReport.Alberta.models;

import javax.persistence.*;

@Entity()
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @JoinColumn(name = "user")
    @ManyToOne
    private User user;


    public Authority(){}
    public Authority(String title,User user){
        this.title = title;
        this.user = user;
    }

    //GETTERS
    public String getTitle(){
        return this.title;
    }
    public Long getId(){
        return this.id;
    }
    public User getUser() {
        return user;
    }

    //SETTERS
    public void setTitle(String title){
        this.title = title;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
