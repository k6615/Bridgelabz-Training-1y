package com.arrayList;

public class student {
    int Rollno;
    String name;
    double percentage;
    String id;

    public student(int rollno, String name, double percentage, String id) {
        Rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        this.id = id;
    }

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "student{" +
                "Rollno=" + Rollno +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", id='" + id + '\'' +
                '}';
    }
}
