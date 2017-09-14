package com.bazingagain.firstdemo.enums;

import com.sun.tools.javac.jvm.Gen;

/**
 * Created on 14/09/2017.
 *
 * @author Xiaolei-Peng
 */
public enum  Gender {
    MALE(1, "男"),
    FEMALE(2, "女");
    private int id;
    private String name;

    private Gender(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Gender getGender(int id) {
        if (id == 1) {
            return MALE;
        } else if (id == 2) {
            return FEMALE;
        }
        return null;
    }

}
