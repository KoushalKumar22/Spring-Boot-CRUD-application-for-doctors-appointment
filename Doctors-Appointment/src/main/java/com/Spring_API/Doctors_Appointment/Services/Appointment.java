package com.Spring_API.Doctors_Appointment.Services;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Doctors_Appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID_NO")
    int appid;

    @Column(name = "Patient_name")
    String pname;

    @Column(name = "apptime")
    LocalTime atime;

    @Column(name = "appdate")
    LocalDate adate;

    @Column(name = "Problem")
    String problem;

    public Appointment() {
    }

    public Appointment(int appid, String pname, LocalTime atime, LocalDate adate, String problem) {
        this.appid = appid;
        this.pname = pname;
        this.atime = atime;
        this.adate = adate;
        this.problem = problem;
    }

    public int getAppid() {
        return appid;
    }

    public void setAppid(int appid) {
        this.appid = appid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public LocalTime getAtime() {
        return atime;
    }

    public void setAtime(LocalTime atime) {
        this.atime = atime;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public LocalDate getAdate() {
        return adate;
    }

    public void setAdate(LocalDate adate) {
        this.adate = adate;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appid=" + appid +
                ", pname='" + pname + '\'' +
                ", atime=" + atime +
                ", adate=" + adate +
                ", problem='" + problem + '\'' +
                '}';
    }



}
