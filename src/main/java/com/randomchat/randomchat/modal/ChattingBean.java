package com.randomchat.randomchat.modal;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHATTING")
public class ChattingBean implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private String ID;
    private String CHATTING;
    private String CHATTINGTIME;


    public ChattingBean() {
    }

    public ChattingBean(String ID, String CHATTING, String CHATTINGTIME) {
        this.ID = ID;
        this.CHATTING = CHATTING;
        this.CHATTINGTIME = CHATTINGTIME;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCHATTING() {
        return this.CHATTING;
    }

    public void setCHATTING(String CHATTING) {
        this.CHATTING = CHATTING;
    }

    public String getCHATTINGTIME() {
        return this.CHATTINGTIME;
    }

    public void setCHATTINGTIME(String CHATTINGTIME) {
        this.CHATTINGTIME = CHATTINGTIME;
    }

    public ChattingBean ID(String ID) {
        this.ID = ID;
        return this;
    }

    public ChattingBean CHATTING(String CHATTING) {
        this.CHATTING = CHATTING;
        return this;
    }

    public ChattingBean CHATTINGTIME(String CHATTINGTIME) {
        this.CHATTINGTIME = CHATTINGTIME;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ChattingBean)) {
            return false;
        }
        ChattingBean chattingBean = (ChattingBean) o;
        return Objects.equals(ID, chattingBean.ID) && Objects.equals(CHATTING, chattingBean.CHATTING) && Objects.equals(CHATTINGTIME, chattingBean.CHATTINGTIME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, CHATTING, CHATTINGTIME);
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + getID() + "'" +
            ", CHATTING='" + getCHATTING() + "'" +
            ", CHATTINGTIME='" + getCHATTINGTIME() + "'" +
            "}";
    }

}
