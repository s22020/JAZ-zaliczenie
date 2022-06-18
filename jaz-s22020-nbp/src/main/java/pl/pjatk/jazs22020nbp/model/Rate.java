package pl.pjatk.jazs22020nbp.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private Gold gold;
    @Column
    private LocalDate startdate;
    @Column
    private LocalDate enddate;
    @Column
    private Double rate;
    @Column
    private LocalDate querydate;
    @Column
    private LocalTime querytime;

    public Rate(Integer id, Gold gold, LocalDate startdate, LocalDate enddate, Double rate, LocalDate querydate, LocalTime querytime) {
        this.id = id;
        this.gold = gold;
        this.startdate = startdate;
        this.enddate = enddate;
        this.rate = rate;
        this.querydate = querydate;
        this.querytime = querytime;
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

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public LocalDate getQuerydate() {
        return querydate;
    }

    public void setQuerydate(LocalDate querydate) {
        this.querydate = querydate;
    }

    public LocalTime getQuerytime() {
        return querytime;
    }

    public void setQuerytime(LocalTime querytime) {
        this.querytime = querytime;
    }
}
