package com.randomchat.randomchat.modal;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEW")
public class ReviewBean implements Serializable{
    private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private String ID;
    private Integer CHATSCORE;
    private String REVIEW;

    public ReviewBean() {
    }

    public ReviewBean(String ID, Integer CHATSCORE, String REVIEW) {
        this.ID = ID;
        this.CHATSCORE = CHATSCORE;
        this.REVIEW = REVIEW;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getCHATSCORE() {
        return this.CHATSCORE;
    }

    public void setCHATSCORE(Integer CHATSCORE) {
        this.CHATSCORE = CHATSCORE;
    }

    public String getREVIEW() {
        return this.REVIEW;
    }

    public void setREVIEW(String REVIEW) {
        this.REVIEW = REVIEW;
    }

    public ReviewBean ID(String ID) {
        this.ID = ID;
        return this;
    }

    public ReviewBean CHATSCORE(Integer CHATSCORE) {
        this.CHATSCORE = CHATSCORE;
        return this;
    }

    public ReviewBean REVIEW(String REVIEW) {
        this.REVIEW = REVIEW;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ReviewBean)) {
            return false;
        }
        ReviewBean reviewBean = (ReviewBean) o;
        return Objects.equals(ID, reviewBean.ID) && Objects.equals(CHATSCORE, reviewBean.CHATSCORE) && Objects.equals(REVIEW, reviewBean.REVIEW);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, CHATSCORE, REVIEW);
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + getID() + "'" +
            ", CHATSCORE='" + getCHATSCORE() + "'" +
            ", REVIEW='" + getREVIEW() + "'" +
            "}";
    }
}
