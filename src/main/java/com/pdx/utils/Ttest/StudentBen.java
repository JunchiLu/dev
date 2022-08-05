package com.pdx.utils.Ttest;

/**
 * @ClassName:StudentBen
 * @Author JunchiLu
 * @Date 2022/7/18
 * @Version 1.0
 */
public class StudentBen {
    String na;
    Integer id;

    @Override
    public String toString() {
        return "StudentBen{" +
                "na='" + na + '\'' +
                ", id=" + id +
                '}';
    }

    public StudentBen() {
    }

    public StudentBen(String na, Integer id) {
        this.na = na;
        this.id = id;
    }

    public String getNa() {
        return na;
    }

    public void setNa(String na) {
        this.na = na;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
