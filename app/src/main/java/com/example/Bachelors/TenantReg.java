package com.example.Bachelors;

public class TenantReg {
    String fname,lname, Mnum, ID, date, Sex, Share, Food;

    public TenantReg() {

    }

    public TenantReg(String fname, String lname, String Mnum, String ID, String date, String Sex, String Share, String Food) {
        this.fname = fname;
        this.lname = lname;
        this.Mnum = Mnum;
        this.ID = ID;
        this.date = date;
        this.Sex = Sex;
        this.Share = Share;
        this.Food = Food;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setMnum(String mnum) {
        Mnum = mnum;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public void setShare(String share) {
        Share = share;
    }

    public void setFood(String food) {
        Food = food;
    }

    public String getLname() {
        return lname;
    }

    public String getMnum() {
        return Mnum;
    }

    public String getID() {
        return ID;
    }

    public String getDate() {
        return date;
    }

    public String getSex() {
        return Sex;
    }

    public String getShare() {
        return Share;
    }

    public String getFood() {
        return Food;
    }
}


