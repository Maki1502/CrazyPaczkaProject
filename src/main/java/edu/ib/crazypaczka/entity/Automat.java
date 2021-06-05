package edu.ib.crazypaczka.entity;

import javax.persistence.*;

@Entity
public class Automat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private int s_locker;
    private int m_locker;
    private int l_locker;

    public Automat(Long id, String address, int s_locker, int m_locker, int l_locker) {
        this.id = id;
        this.address = address;
        this.s_locker = s_locker;
        this.m_locker = m_locker;
        this.l_locker = l_locker;
    }

    public Automat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getS_locker() {
        return s_locker;
    }

    public void setS_locker(int s_locker) {
        this.s_locker = s_locker;
    }

    public int getM_locker() {
        return m_locker;
    }

    public void setM_locker(int m_locker) {
        this.m_locker = m_locker;
    }

    public int getL_locker() {
        return l_locker;
    }

    public void setL_locker(int l_locker) {
        this.l_locker = l_locker;
    }
}
