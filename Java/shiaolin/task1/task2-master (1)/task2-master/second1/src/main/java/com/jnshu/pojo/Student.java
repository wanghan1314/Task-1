package com.jnshu.pojo;

import java.sql.Timestamp;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private int qq;
    private long enrolment_time;
    private String learning_type;
    private int number;
    private String desire;
    private long create_at;
    private long update_at;


    public void setId(int id){
        this.id = id;
    }

    public int getId(){ return id; }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public int getQq() {
        return qq;
    }

    public void setEnrolment_time(long start_time) {
        this.enrolment_time= start_time;
    }

    public long getEnrolment_time() {
        return enrolment_time;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() { return number; }

    public void setDesire(String desire) {
        this.desire = desire;
    }

    public String getDesire() {
        return desire;
    }

    public void setLearning_type(String learning_type){ this.learning_type = learning_type;}

    public String getLearning_type(){return learning_type; }

    public void setCreate_at(long i){this.create_at=i;}

    public long getCreate_at(){return create_at;}

    public void setUpdate_at(long i){this.update_at = i;}

    public long getUpdate_at(){return update_at;}



    @Override
    public String toString(){
        return "Student(id = " + id + ",name = " + name + ",qq = " + qq + "," +
                " enrolment_time=" + enrolment_time +",learning_type = "
                +learning_type+",number = " + number +",desire = " + desire +",create_at = " +create_at+")";
    }
}
