package com.randomchat.randomchat.modal;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT")
public class ClassBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private String ID;
    private Integer ADMIN;
    private String NAME;
    private String PASSWORD;
    private String GENDER;
    private String PHONE;
    private String EMAIL;
    private String SCHOOL;
    private String CHATTING;

    public ClassBean() {
    }

    public ClassBean(String ID, Integer ADMIN, String NAME, String PASSWORD, String GENDER, String PHONE, String EMAIL, String SCHOOL, String CHATTING) {
        this.ID = ID;
        this.ADMIN = ADMIN;
        this.NAME = NAME;
        this.PASSWORD = PASSWORD;
        this.GENDER = GENDER;
        this.PHONE = PHONE;
        this.EMAIL = EMAIL;
        this.SCHOOL = SCHOOL;
        this.CHATTING = CHATTING;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getADMIN() {
        return this.ADMIN;
    }

    public void setADMIN(Integer ADMIN) {
        this.ADMIN = ADMIN;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPASSWORD() {
        return this.PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getGENDER() {
        return this.GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getPHONE() {
        return this.PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getEMAIL() {
        return this.EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSCHOOL() {
        return this.SCHOOL;
    }

    public void setSCHOOL(String SCHOOL) {
        this.SCHOOL = SCHOOL;
    }

    public String getCHATTING() {
        return this.CHATTING;
    }

    public void setCHATTING(String CHATTING) {
        this.CHATTING = CHATTING;
    }

    public ClassBean ID(String ID) {
        this.ID = ID;
        return this;
    }

    public ClassBean ADMIN(Integer ADMIN) {
        this.ADMIN = ADMIN;
        return this;
    }

    public ClassBean NAME(String NAME) {
        this.NAME = NAME;
        return this;
    }

    public ClassBean PASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
        return this;
    }

    public ClassBean GENDER(String GENDER) {
        this.GENDER = GENDER;
        return this;
    }

    public ClassBean PHONE(String PHONE) {
        this.PHONE = PHONE;
        return this;
    }

    public ClassBean EMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
        return this;
    }

    public ClassBean SCHOOL(String SCHOOL) {
        this.SCHOOL = SCHOOL;
        return this;
    }

    public ClassBean CHATTING(String CHATTING) {
        this.CHATTING = CHATTING;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ClassBean)) {
            return false;
        }
        ClassBean classBean = (ClassBean) o;
        return Objects.equals(ID, classBean.ID) && Objects.equals(ADMIN, classBean.ADMIN) && Objects.equals(NAME, classBean.NAME) && Objects.equals(PASSWORD, classBean.PASSWORD) && Objects.equals(GENDER, classBean.GENDER) && Objects.equals(PHONE, classBean.PHONE) && Objects.equals(EMAIL, classBean.EMAIL) && Objects.equals(SCHOOL, classBean.SCHOOL) && Objects.equals(CHATTING, classBean.CHATTING);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, ADMIN, NAME, PASSWORD, GENDER, PHONE, EMAIL, SCHOOL, CHATTING);
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + getID() + "'" +
            ", ADMIN='" + getADMIN() + "'" +
            ", NAME='" + getNAME() + "'" +
            ", PASSWORD='" + getPASSWORD() + "'" +
            ", GENDER='" + getGENDER() + "'" +
            ", PHONE='" + getPHONE() + "'" +
            ", EMAIL='" + getEMAIL() + "'" +
            ", SCHOOL='" + getSCHOOL() + "'" +
            ", CHATTING='" + getCHATTING() + "'" +
            "}";
    }

}