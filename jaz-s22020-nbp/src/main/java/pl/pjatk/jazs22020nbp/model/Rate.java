package pl.pjatk.jazs22020nbp.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    @Enumerated(EnumType.STRING)
    private Gold gold;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
    @Column
    private Double rate;
    @Column
    private Date queryDate;
    @Column
    private Time queryTime;

    public Rate(Integer id, Gold gold, Date startDate, Date endDate, Double rate, Date queryDate, Time queryTime) {
        this.id = id;
        this.gold = gold;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rate = rate;
        this.queryDate = queryDate;
        this.queryTime = queryTime;
    }

    public Rate() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(Date queryDate) {
        this.queryDate = queryDate;
    }

    public Time getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Time queryTime) {
        this.queryTime = queryTime;
    }
}
