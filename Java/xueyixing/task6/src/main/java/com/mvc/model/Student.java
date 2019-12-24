package com.mvc.model;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -1920132783508690989L;

	private Integer ID;
	private String name;
	private String type;
	private Long enrolmentTime;
	private String direction;
	private int isGood;
	private int isWork;
	private String position;
	private String introduce;

	public Integer getID() {
		return ID;
	}
	public void setID(Integer ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getEnrolmentTime() {
		return enrolmentTime;
	}
	public void setEnrolmentTime(Long enrolmentTime) {
		this.enrolmentTime = enrolmentTime;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public int getIsWork() {
		return isWork;
	}
	public void setIsWork(int isWork) {
		this.isWork = isWork;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getIsGood() {
		return isGood;
	}
	public void setIsGood(int isGood) {
		this.isGood = isGood;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	public String toString() {
		return "Student{" +
				"ID=" + ID +
				", name='" + name + '\'' +
				", type='" + type + '\'' +
				", enrolmentTime=" + enrolmentTime +
				", direction='" + direction + '\'' +
				", isGood=" + isGood +
				", isWork=" + isWork +
				", position='" + position + '\'' +
				", introduce='" + introduce + '\'' +
				'}';
	}
}