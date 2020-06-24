package com.CourseBusiness;

import java.io.Serializable;

public class Course implements Serializable {

	public Course(int courseID, String term, String courseTitle, String instructor, String subjectArea) {
		super();
		this.courseID = courseID;
		this.term = term;
		this.courseTitle = courseTitle;
		this.instructor = instructor;
		this.subjectArea = subjectArea;
	}

	private int courseID;
	private String term;
	private String courseTitle;
	private String instructor;
	private String subjectArea;

	@Override
	public String toString() {
		return "Course [term=" + term + ", courseID=" + courseID + ", courseTitle=" + courseTitle + ", instructor="
				+ instructor + ", subjectArea=" + subjectArea + "]";
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getSubjectArea() {
		return subjectArea;
	}

	public void setSubjectArea(String subjectArea) {
		this.subjectArea = subjectArea;
	}

}
