package com.bazingagain.firstdemo.object;

import com.bazingagain.firstdemo.enums.Gender;

import java.util.Date;

/**
 * Created on 14/09/2017.
 *
 * @author Xiaolei-Peng
 */
public class User {
    private Long id;
    private String userName;
    private Date birthday;
    private Gender gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
