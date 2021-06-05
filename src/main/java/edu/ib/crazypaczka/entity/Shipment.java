package edu.ib.crazypaczka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String size;
    private double price;

    private String cons_place;
    private String rec_place;

    private String cons_date;
    private String send_date;
    private String del_date;
    private String recept_date;

    private String recip_id;
    private int client_id;

    private String status;

    public Shipment(Long id, String size, double price, String cons_place,
                    String rec_place, String cons_date, String send_date, String del_date,
                    String recept_date, String recip_id, int client_id, String status) {
        this.id = id;
        this.size = size;
        this.price = price;
        this.cons_place = cons_place;
        this.rec_place = rec_place;
        this.cons_date = cons_date;
        this.send_date = send_date;
        this.del_date = del_date;
        this.recept_date = recept_date;
        this.recip_id = recip_id;
        this.client_id = client_id;
        this.status = status;
    }

    public Shipment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCons_place() {
        return cons_place;
    }

    public void setCons_place(String cons_place) {
        this.cons_place = cons_place;
    }

    public String getRec_place() {
        return rec_place;
    }

    public void setRec_place(String rec_place) {
        this.rec_place = rec_place;
    }

    public String getCons_date() {
        return cons_date;
    }

    public void setCons_date(String cons_date) {
        this.cons_date = cons_date;
    }

    public String getSend_date() {
        return send_date;
    }

    public void setSend_date(String send_date) {
        this.send_date = send_date;
    }

    public String getDel_date() {
        return del_date;
    }

    public void setDel_date(String del_date) {
        this.del_date = del_date;
    }

    public String getRecept_date() {
        return recept_date;
    }

    public void setRecept_date(String recept_date) {
        this.recept_date = recept_date;
    }

    public String getRecip_id() {
        return recip_id;
    }

    public void setRecip_id(String recip_id) {
        this.recip_id = recip_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
