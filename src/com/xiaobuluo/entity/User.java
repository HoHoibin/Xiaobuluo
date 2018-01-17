package com.xiaobuluo.entity;

import java.util.Date;

/**
 * Created by DylanHo on 08/01/2018.
 * Email: imhhb1997@gmail.com
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String avatar;
    private Date register_date;
    private Date lastlogin_date;

    public User(int id) {
        this.id = id;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    public Date getLastlogin_date() {
        return lastlogin_date;
    }

    public void setLastlogin_date(Date lastlogin_date) {
        this.lastlogin_date = lastlogin_date;
    }
}
