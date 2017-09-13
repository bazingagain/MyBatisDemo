package com.bazingagain.firstdemo.object;

/**
 * Created on 13/09/2017.
 *
 * @author Xiaolei-Peng
 */
public class Role {
    private Long id;
    private String roleName;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String name) {
        this.roleName = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
