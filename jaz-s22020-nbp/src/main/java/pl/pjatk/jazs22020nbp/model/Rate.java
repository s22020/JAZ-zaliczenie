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
    private Gold gold;
    @Column
    private Date startdate;
    @Column
    private Date enddate;
    @Column
    private Double rate;
    @Column
    private Date querydate;
    @Column
    private Time querytime;

    public Rate(Integer id, Gold gold, Date startdate, Date enddate, Double rate, Date querydate, Time querytime) {
        this.id = id;
        this.gold = gold;
        this.startdate = startdate;
        this.enddate = enddate;
        this.rate = rate;
        this.querydate = querydate;
        this.querytime = querytime;
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

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getQuerydate() {
        return querydate;
    }

    public void setQuerydate(Date querydate) {
        this.querydate = querydate;
    }

    public Time getQuerytime() {
        return querytime;
    }

    public void setQuerytime(Time querytime) {
        this.querytime = querytime;
    }
}
