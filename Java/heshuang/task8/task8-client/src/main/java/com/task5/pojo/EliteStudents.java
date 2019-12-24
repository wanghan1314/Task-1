package com.task5.pojo;

import java.io.Serializable;

public class EliteStudents implements Serializable {
    private static final long serialVersionUID = 1563056272025335248L;
    int id;
    String name;
    String stuIntroduction;
    String isStudy;
    String isWork;
    long createAt;
    long updateAt;

    public EliteStudents() {
    }

    public EliteStudents(int id, String name, String stuIntroduction, String isStudy, String isWork, long createAt, long updateAt) {
        this.id = id;
        this.name = name;
        this.stuIntroduction = stuIntroduction;
        this.isStudy = isStudy;
        this.isWork = isWork;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stuIntroduction='" + stuIntroduction + '\'' +
                ", isStudy='" + isStudy + '\'' +
                ", isWork='" + isWork + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuIntroduction() {
        return stuIntroduction;
    }

    public void setStuIntroduction(String stuIntroduction) {
        this.stuIntroduction = stuIntroduction;
    }

    public String getIsStudy() {
        return isStudy;
    }

    public void setIsStudy(String isStudy) {
        this.isStudy = isStudy;
    }

    public String getIsWork() {
        return isWork;
    }

    public void setIsWork(String isWork) {
        this.isWork = isWork;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }
}
